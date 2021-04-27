package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class CartController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def createCart() = Action { implicit request: Request[AnyContent] =>
    Ok("cart created")
  }

  def getCart(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("cart retrieved")
  }

  def updateCart(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("cart updated")
  }

  def deleteCart(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("cart deleted")
  }

}
