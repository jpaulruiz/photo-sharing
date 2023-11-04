package models.domain

import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json.Writes

case class User(username: String, password: String, isLogon: Boolean = false)

object User {
    // val tupled = (username: String, password: String, isLogon: Boolean) => User(username, password, isLogon)
    val tupled = (apply: (String, String, Boolean) => User).tupled
    
    implicit val userWrites: Writes[User] = (
        (JsPath \ "username").write[String] and
        (JsPath \ "password").write[String] and
        (JsPath \ "isLogon").write[Boolean]
    )(unlift(User.unapply))
}