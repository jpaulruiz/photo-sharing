package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.domain._
import models.repo._
import java.nio.file._
import scala.concurrent._
import play.api.libs.json._

@Singleton
class PostController @Inject()(val controllerComponents: ControllerComponents,
  val post: PostRepo,
  val comment: CommentRepo,
  val user: UserRepo)
  (implicit val ec: ExecutionContext) extends BaseController {

//   def index() = Action { implicit request: Request[AnyContent] =>
//     request.session.get("username") match {
//         case Some(username) =>
//             Ok(views.html.index(username))
//         case None =>
//             Redirect(routes.AuthController.get())
//     }
//   }

  val commentForm = Form(
    tuple(
        "id" -> default(longNumber, 0L),
        "postId" -> default(longNumber, 0L),
        "userId" -> nonEmptyText,
        "comment" -> nonEmptyText,
    )
  )

  def get() = Action.async { implicit request =>
    request.session.get("username") match {
        case Some(username) => {
            post.get.map(t => {
                Ok(Json.toJson(t.map(p => Post(p.id, p.userId, p.url, p.description, p.img, p.ext))))
            })
        }
        case None =>
            // Future(Redirect(routes.AuthController.get()))
            post.get.map(t => {
                Ok(Json.toJson(t.map(p => Post(p.id, p.userId, p.url, p.description, p.img, p.ext))))
            })
            // user.get.map(t => {
            //     Ok(Json.toJson(t.map(u => User(u.username, u.password))))
            // })
            // Future(Ok(JsObject(Seq("message" -> JsString("Logon first.")))))
    }
  }

  def create() = Action(parse.multipartFormData) { implicit request =>
    if (request.body.files.size > 0) {
      request.body
        .file("url")
        .map { picture =>
          val imageBytes = Files.readAllBytes(picture.ref.path)
          val filename = Paths.get(picture.filename).getFileName
          val filesize = picture.fileSize
          val filetype = picture.contentType
          request.body.dataParts("desc").map( desc => {
              post.create(
                Post(1L,
                  request.body.dataParts("userId").head,
                  Some(filename.toString()),
                  desc,
                  Some(imageBytes),
                  filetype)
              )
            }
          )
        }
      Ok(JsObject(Seq("message" -> JsString("Post successfully created1."))))
    } else {
      request.body.dataParts("desc").map( desc => {
        post.create(
          Post(1L,
            request.body.dataParts("userId").head,
            None,
            desc,
            None,
            None)
        )
      })
       Ok(JsObject(Seq("message" -> JsString("Post successfully created2."))))
    }
  }
}
