package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CommentRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider , userRepository: UserRepository, reviewRepository: ReviewRepository)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CommentTable(tag: Tag) extends Table[Comment](tag, "comment") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Long]("user")
    def review = column[Long]("course")
    def description = column[String]("description")

    def * = (id, user, review ,description) <> ((Comment.apply _).tupled, Comment.unapply)

  }

  import userRepository.UserTable
  import reviewRepository.ReviewTable

  private val users = TableQuery[UserTable]
  private val reviews = TableQuery[ReviewTable]
  private val comments = TableQuery[CommentTable]

  def add(user: Long, review: Long, description: String): Future[Comment] = db.run {
    (comments.map(c => (c.user, c.review,c.description))
      returning reviews.map(_.id)
      into { case ((user, review,description), id) => Comment(id, user, review,description) }
      ) += (user, review,description)
  }

  def get(id: Long): Future[Option[Review]] = db.run {
    reviews.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_Comment: Comment): Future[Unit] = {
    val commentToUpdate: Comment = new_Comment.copy(id)
    db.run(comments.filter(_.id === id).update(commentToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(comments.filter(_.id === id).delete).map(_ => ())

}
