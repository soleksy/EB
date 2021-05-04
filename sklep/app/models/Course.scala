package models

import play.api.libs.json.Json

case class Course(id: Long, name: String, description: String, category: Long)

object Course {
  implicit val courseFormat = Json.format[Course]
}