package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class UserController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createUser() = Action { implicit request: Request[AnyContent] =>
    Ok("user created")
  }

  def getUser(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("user retrieved")
  }

  def updateUser(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("user updated")
  }

  def deleteUser(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("user deleted")
  }

}
