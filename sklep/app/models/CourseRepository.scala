package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CourseRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, categoryRepository: CategoryRepository)(implicit ec: ExecutionContext) {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

   class CourseTable(tag: Tag) extends Table[Course](tag, "course") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def description = column[String]("description")
    def category = column[Long]("category")
    def * = (id , name , description ,category) <> ((Course.apply _).tupled, Course.unapply)

  }

  import categoryRepository.CategoryTable


  private val courses = TableQuery[CourseTable]
  private val categories = TableQuery[CategoryTable]

  def add(name: String ,description: String, category: Int): Future[Course] = db.run {
    (courses.map(c => (c.name, c.description, c.category))
      returning courses.map(_.id)
    into {case ((name, description, category), id) => Course(id, name, description, category)}
    ) += (name,description,category)
  }

  def get (id: Long): Future[Option[Course]] = db.run{
    courses.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_course: Course): Future[Unit] = {
    val courseToUpdate: Course = new_course.copy(id)
    db.run(courses.filter(_.id === id).update(courseToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(courses.filter(_.id ===id).delete).map(_ => ())


}
