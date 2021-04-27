package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class CommentController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createComment() = Action { implicit request: Request[AnyContent] =>
    Ok("comment created")
  }

  def getComment(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("comment retrieved")
  }

  def updateComment(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("comment updated")
  }

  def deleteComment(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("comment deleted")
  }

}
