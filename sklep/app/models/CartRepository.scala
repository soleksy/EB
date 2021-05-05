package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CartRepository  @Inject() (dbConfigProvider: DatabaseConfigProvider , userRepository: UserRepository, orderRepository: OrderRepository)(implicit ec: ExecutionContext)  {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CartTable(tag: Tag) extends Table[Cart](tag, "order") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def value = column[Double]("value")
    def user = column[Long]("user")
    def order = column[Long]("order")

    def * = (id, value, user ,order  ) <> ((Cart.apply _).tupled, Cart.unapply)

  }

  import userRepository.UserTable
  import orderRepository.OrderTable

  private val users = TableQuery[UserTable]
  private val carts = TableQuery[CartTable]
  private val orders = TableQuery[OrderTable]

  def add(user: Long, order: Long, value: Double): Future[Cart] = db.run {
    (carts.map(c => (c.user, c.value, c.order))
      returning carts.map(_.id)
      into { case ((user, value, order), id) => Cart(id, value, user, order) }
      ) += (user, value, order)
  }

  def get(id: Long): Future[Option[Cart]] = db.run {
    carts.filter(_.id === id).result.headOption
  }

  def update(id: Long, new_cart: Cart): Future[Unit] = {
    val cartToUpdate: Cart = new_cart.copy(id)
    db.run(carts.filter(_.id === id).update(cartToUpdate)).map(_ => ())
  }

  def delete (id: Long): Future[Unit] = db.run(carts.filter(_.id === id).delete).map(_ => ())

}
