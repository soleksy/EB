package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ClassroomController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createClassroom() = Action { implicit request: Request[AnyContent] =>
    Ok("classroom created")
  }

  def getClassroom(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("classroom retrieved")
  }

  def updateClassroom(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("classroom updated")
  }

  def deleteClassroom(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("classroom deleted")
  }

}
