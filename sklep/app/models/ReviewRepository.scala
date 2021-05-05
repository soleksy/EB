package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ReviewRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider , userRepository: UserRepository, courseRepository: CourseRepository)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class ReviewTable(tag: Tag) extends Table[Review](tag, "review") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def reviewer_id = column[Long]("reviewer")
    def reviewed_id = column[Long]("reviewed")
    def course_id = column[Long]("course")
    def description = column[String]("description")

    def * = (id, reviewer_id, reviewed_id ,course_id ,description) <> ((Review.apply _).tupled, Review.unapply)

  }

  import userRepository.UserTable
  import courseRepository.CourseTable

  private val users = TableQuery[UserTable]
  private val courses = TableQuery[CourseTable]
  private val reviews = TableQuery[ReviewTable]

  def add(reviewer_id: Long, reviewed_id: Long, course_id: Long, description: String): Future[Review] = db.run {
    (reviews.map(r => (r.reviewed_id, r.reviewer_id, r.course_id,description))
      returning reviews.map(_.id)
      into { case ((reviewer_id, reviewed_id, course_id,description), id) => Review(id, reviewer_id, reviewed_id, course_id,description) }
      ) += (reviewer_id, reviewed_id, course_id,description)
  }

  def get(id: Long): Future[Option[Review]] = db.run {
    reviews.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_Review: Review): Future[Unit] = {
    val reviewToUpdate: Review = new_Review.copy(id)
    db.run(reviews.filter(_.id === id).update(reviewToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(reviews.filter(_.id === id).delete).map(_ => ())

}
