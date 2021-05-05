package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class OrderRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider , userRepository: UserRepository)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class OrderTable(tag: Tag) extends Table[Order](tag, "order") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Long]("user")
    def * = (id, user ) <> ((Order.apply _).tupled, Order.unapply)

  }

  import userRepository.UserTable

  private val users = TableQuery[UserTable]
  private val orders = TableQuery[OrderTable]

  def add(user: Long): Future[Order] = db.run {
    (orders.map(o => o.user)
      returning orders.map(_.id)
      into {case (user,id) => Order(id, user)}
      ) += user
  }

  def get (id: Long): Future[Option[Order]] = db.run{
    orders.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_order: Order): Future[Unit] = {
    val orderToUpdate: Order = new_order.copy(id)
    db.run(orders.filter(_.id === id).update(orderToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(orders.filter(_.id === id).delete).map(_ => ())

}
