package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import scala.concurrent._
import java.util.UUID
import models.domain._
import models.repo._
import play.api.libs.json._

@Singleton
class AuthController @Inject()(val controllerComponents: ControllerComponents,
  val user: UserRepo)
  (implicit val ec: ExecutionContext) extends BaseController {

    val logonForm = Form(
      tuple(
        "username" -> nonEmptyText,
        "password" -> nonEmptyText
      )
    )

    def index = Action.async { implicit request =>
        logonForm.bindFromRequest().fold(
            formWithErrors => {
                Future(Ok(JsObject(Seq("message" -> JsString("Invalid form.")))))
            },
            u => {
                request.session.get("username") match {
                    case Some(username) => {
                        Future(Ok(JsObject(Seq("message" -> JsString("Logon successfully.")))))
                    }
                    case None => {
                        user.get(u._1).map(l => {
                            if (l.size > 0) {
                                if (l(0).password == u._2) {
                                    Ok(JsObject(Seq("message" -> JsString("Logon successfully.")))).withSession("username" -> u._1)
                                } else {
                                    Ok(JsObject(Seq("message" -> JsString("Incorrect password."))))
                                }
                            } else {
                                Ok(JsObject(Seq("message" -> JsString("Account does not exist."))))
                            }
                        })
                    }
                }
                
            }
        )
    }

    // def logout = Action { implicit request =>
    //     Redirect(routes.AuthController.get()).withNewSession
    // }
}