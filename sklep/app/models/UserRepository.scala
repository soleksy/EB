package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class UserTable(tag: Tag) extends Table[User](tag, "category") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def login = column[String]("login")
    def email = column[String]("email")
    def password = column[String]("password")

    def * = (id, login, email, password ) <> ((User.apply _).tupled, User.unapply)

  }

  private val users = TableQuery[UserTable]

  def add(login: String, email: String, password: String): Future[User] = db.run {
    (users.map(u => (u.login, u.email, u.password))
      returning users.map(_.id)
      into {case ((login, email, password),id) => User(id, login, email, password)}
      ) += (login,email,password)
  }

  def get (id: Long): Future[Option[User]] = db.run{
    users.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_user: User): Future[Unit] = {
    val userToUpdate: User = new_user.copy(id)
    db.run(users.filter(_.id === id).update(userToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(users.filter(_.id ===id).delete).map(_ => ())

}
