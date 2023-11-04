package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.repo.UserRepo

@Singleton
class HomeController @Inject()
  (val controllerComponents: ControllerComponents,
    user: UserRepo) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
