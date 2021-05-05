package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ProfileRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class ProfileTable(tag: Tag) extends Table[Profile](tag, "profile") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Long]("user")
    def description = column[String]("description")

    def * = (id, user, description ) <> ((Profile.apply _).tupled, Profile.unapply)

  }
  import userRepository.UserTable

  private val users = TableQuery[UserTable]
  private val profiles = TableQuery[ProfileTable]

  def add(user: Long, description: String): Future[Profile] = db.run {
    (profiles.map(p => (p.user, p.description))
      returning profiles.map(_.id)
      into {case ((user, description),id) => Profile(id, user, description)}
      ) += (user, description)
  }

  def get (id: Long): Future[Option[Profile]] = db.run{
    profiles.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_profile: Profile): Future[Unit] = {
    val profileToUpdate: Profile = new_profile.copy(id)
    db.run(profiles.filter(_.id === id).update(profileToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(profiles.filter(_.id ===id).delete).map(_ => ())

}
