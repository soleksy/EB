package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ProfileController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createProfile() = Action { implicit request: Request[AnyContent] =>
    Ok("profile created")
  }

  def getProfile(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("profile retrieved")
  }

  def updateProfile(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("profile updated")
  }

  def deleteProfile(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("profile deleted")
  }

}
