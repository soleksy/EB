package models

import play.api.libs.json.Json

case class Order(id: Long, user: Long )

object Order {
  implicit val userFormat = Json.format[Order]
}