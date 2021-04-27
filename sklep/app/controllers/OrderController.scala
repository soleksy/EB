package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class OrderController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createOrder() = Action { implicit request: Request[AnyContent] =>
    Ok("order created")
  }

  def getOrder(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("order retrieved")
  }

  def updateOrder(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("order updated")
  }

  def deleteOrder(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("order deleted")
  }

}
