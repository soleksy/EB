package models

import play.api.libs.json.Json

case class Review(id: Long, reviewer_id: Long, reviewed_id: Long, course_id: Long, description: String)


object Review {
  implicit val reviewFormat = Json.format[Review]
}