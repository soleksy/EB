package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CategoryRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CategoryTable(tag: Tag) extends Table[Category](tag, "category") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")

    def * = (id , name ) <> ((Category.apply _).tupled, Category.unapply)

  }

  private val categories = TableQuery[CategoryTable]

  def add(name: String): Future[Category] = db.run {
    (categories.map(c => c.name)
      returning categories.map(_.id)
      into {case (name, id) => Category(id, name)}
      ) += name
  }

  def get (id: Long): Future[Option[Category]] = db.run{
    categories.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_category: Category): Future[Unit] = {
    val categoryToUpdate: Category = new_category.copy(id)
    db.run(categories.filter(_.id === id).update(categoryToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(categories.filter(_.id ===id).delete).map(_ => ())


}
