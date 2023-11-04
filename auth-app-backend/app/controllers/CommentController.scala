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
import java.util.UUID

@Singleton
class CommentController @Inject()(val controllerComponents: ControllerComponents,
  val post: PostRepo,
  val commentRepo: CommentRepo,
  val postController: PostController)
  (implicit val ec: ExecutionContext) extends BaseController {

//   def create() = Action.async { implicit request =>
//     postController.commentForm.bindFromRequest().fold(
//         formWithErrors => {
//             Future(Redirect(routes.PostController.get()))
//         },
//         comment => {
//             // commentRepo.create(comment.copy(postId = id))
//             commentRepo.getCombinedQueries.map(s => {
//               println(s)
//               "test"
//             })
//             commentRepo.get.map(s => {
//               commentRepo.create(Comment(s.size + 1, comment._2, comment._3, comment._4))
//               Redirect(routes.PostController.get())
//             })
//         }
//     )
//   }
}
