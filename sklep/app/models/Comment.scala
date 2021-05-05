package models

import play.api.libs.json.Json

case class Comment(id: Long, user: Long, review: Long, description: String)


object Comment {
  implicit val commentFormat = Json.format[Comment]
}
