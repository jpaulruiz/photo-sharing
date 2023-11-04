package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import scala.concurrent._
import models.repo.UserRepo
import models.domain.User
import play.api.libs.json._

@Singleton
class RegisterController @Inject()
    (val controllerComponents: ControllerComponents, user: UserRepo)
    (implicit ec: ExecutionContext) extends BaseController {

    def index() = Action { implicit request: Request[AnyContent] =>
        Ok(views.html.index())
    }

    val registerForm = Form(
      tuple(
        "username" -> nonEmptyText
                // .verifying(username => username.matches("^[a-zA-Z][a-zA-Z0-9_]{8,}$"))
        ,"password" -> nonEmptyText
                // .verifying(password => password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$")) 
        ,"confirmPassword" -> nonEmptyText
                // .verifying(password => password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$")) 
      )
    )

    def create = Action.async { implicit request =>
        registerForm.bindFromRequest().fold(
            formWithErrors => {
                Future(Ok(JsObject(Seq("message" -> JsString("Invalid form.")))))
            },
            u => {
                if (u._2 != u._3) {
                    Future(Ok(JsObject(Seq("message" -> JsString("Passwords do not match.")))))
                } else {
                    user.get(u._1).map {
                        list => {
                            if (list.size > 0) {
                                // Redirect(routes.RegisterController.get()) //already exist
                                Ok(JsObject(Seq("message" -> JsString("Account already exists."))))
                            } else {
                                user.create(User(u._1, u._2))
                                // Redirect(routes.RegisterController.get()) //create account
                                Ok(JsObject(Seq("message" -> JsString("Account successfully created."))))
                            }
                        }
                    }
                }
            }
        )
    }
}
