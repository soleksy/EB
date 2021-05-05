package models

import play.api.libs.json.Json

case class Cart(id: Long, value: Double, user: Long, order: Long)

object Cart {
  implicit val cartFormat = Json.format[Cart]
}