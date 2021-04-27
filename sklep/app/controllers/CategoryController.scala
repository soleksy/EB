package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class CategoryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createCategory() = Action { implicit request: Request[AnyContent] =>
    Ok("category created")
  }

  def getCategory(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("category retrieved")
  }

  def updateCategory(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("category updated")
  }

  def deleteCategory(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("category deleted")
  }

}
