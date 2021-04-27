package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ReviewController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createReview() = Action { implicit request: Request[AnyContent] =>
    Ok("review created")
  }

  def getReview(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("review retrieved")
  }

  def updateReview(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("review updated")
  }

  def deleteReview(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("review deleted")
  }

}
