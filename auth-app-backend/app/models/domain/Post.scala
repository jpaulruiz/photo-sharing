package models.domain

import play.api.libs.json._
import play.api.libs.functional.syntax._

case class Post(id: Long, userId: String, url: Option[String], description: String, img: Option[Array[Byte]], ext: Option[String])

object Post {
    val tupled = (apply: (Long, String, Option[String], String, Option[Array[Byte]], Option[String]) => Post).tupled
    
    implicit val postWrites: Writes[Post] = (
        (JsPath \ "id").write[Long] and
        (JsPath \ "userId").write[String] and
        (JsPath \ "url").write[Option[String]] and
        (JsPath \ "description").write[String] and
        (JsPath \ "img").write[Option[Array[Byte]]] and
        (JsPath \ "ext").write[Option[String]]
    )(unlift(Post.unapply))
}