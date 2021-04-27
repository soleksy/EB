package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class DiscountController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createDiscount() = Action { implicit request: Request[AnyContent] =>
    Ok("discount created")
  }

  def getDiscount(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("discount retrieved")
  }

  def updateDiscount(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("discount updated")
  }

  def deleteDiscount(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("discount deleted")
  }

}
