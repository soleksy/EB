package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class CourseController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createCourse() = Action { implicit request: Request[AnyContent] =>
    Ok("course created")
  }

  def getCourse(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("course retrieved")
  }

  def updateCourse(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("course updated")
  }

  def deleteCourse(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("course deleted")
  }

}
