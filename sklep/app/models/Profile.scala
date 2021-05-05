package models

import play.api.libs.json.Json

case class Profile(id: Long, user:Long, description: String)


object Profile {
  implicit val profileFormat = Json.format[Profile]
}