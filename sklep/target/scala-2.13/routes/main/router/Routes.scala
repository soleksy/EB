// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  UserController_8: controllers.UserController,
  // @LINE:14
  CourseController_10: controllers.CourseController,
  // @LINE:20
  CartController_2: controllers.CartController,
  // @LINE:26
  CategoryController_7: controllers.CategoryController,
  // @LINE:32
  ClassroomController_4: controllers.ClassroomController,
  // @LINE:38
  CommentController_6: controllers.CommentController,
  // @LINE:44
  DiscountController_11: controllers.DiscountController,
  // @LINE:50
  OrderController_3: controllers.OrderController,
  // @LINE:56
  ProfileController_0: controllers.ProfileController,
  // @LINE:62
  ReviewController_5: controllers.ReviewController,
  // @LINE:71
  BasicController_1: controllers.BasicController,
  // @LINE:74
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    UserController_8: controllers.UserController,
    // @LINE:14
    CourseController_10: controllers.CourseController,
    // @LINE:20
    CartController_2: controllers.CartController,
    // @LINE:26
    CategoryController_7: controllers.CategoryController,
    // @LINE:32
    ClassroomController_4: controllers.ClassroomController,
    // @LINE:38
    CommentController_6: controllers.CommentController,
    // @LINE:44
    DiscountController_11: controllers.DiscountController,
    // @LINE:50
    OrderController_3: controllers.OrderController,
    // @LINE:56
    ProfileController_0: controllers.ProfileController,
    // @LINE:62
    ReviewController_5: controllers.ReviewController,
    // @LINE:71
    BasicController_1: controllers.BasicController,
    // @LINE:74
    Assets_9: controllers.Assets
  ) = this(errorHandler, UserController_8, CourseController_10, CartController_2, CategoryController_7, ClassroomController_4, CommentController_6, DiscountController_11, OrderController_3, ProfileController_0, ReviewController_5, BasicController_1, Assets_9, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_8, CourseController_10, CartController_2, CategoryController_7, ClassroomController_4, CommentController_6, DiscountController_11, OrderController_3, ProfileController_0, ReviewController_5, BasicController_1, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""", """controllers.UserController.createUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUser(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.updateUser(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.deleteUser(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course/""", """controllers.CourseController.createCourse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course/""" + "$" + """id<[^/]+>""", """controllers.CourseController.getCourse(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course/""" + "$" + """id<[^/]+>""", """controllers.CourseController.updateCourse(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course/""" + "$" + """id<[^/]+>""", """controllers.CourseController.deleteCourse(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""", """controllers.CartController.createCart()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.getCart(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.updateCart(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.deleteCart(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""", """controllers.CategoryController.createCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.getCategory(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.updateCategory(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.deleteCategory(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/""", """controllers.ClassroomController.createClassroom()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/""" + "$" + """id<[^/]+>""", """controllers.ClassroomController.getClassroom(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/""" + "$" + """id<[^/]+>""", """controllers.ClassroomController.updateClassroom(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/""" + "$" + """id<[^/]+>""", """controllers.ClassroomController.deleteClassroom(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""", """controllers.CommentController.createComment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.getComment(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.updateComment(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.deleteComment(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""", """controllers.DiscountController.createDiscount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscount(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.updateDiscount(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscount(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""", """controllers.OrderController.createOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrder(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.updateOrder(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrder(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""", """controllers.ProfileController.createProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.getProfile(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.updateProfile(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.deleteProfile(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""", """controllers.ReviewController.createReview()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.ReviewController.getReview(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.ReviewController.updateReview(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.ReviewController.deleteReview(id:Int)"""),
    ("""GET""", this.prefix, """controllers.BasicController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_UserController_createUser0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/")))
  )
  private[this] lazy val controllers_UserController_createUser0_invoker = createInvoker(
    UserController_8.createUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createUser",
      Nil,
      "POST",
      this.prefix + """user/""",
      """UserController""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_getUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser1_invoker = createInvoker(
    UserController_8.getUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_updateUser2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_updateUser2_invoker = createInvoker(
    UserController_8.updateUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_deleteUser3_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUser3_invoker = createInvoker(
    UserController_8.deleteUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CourseController_createCourse4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course/")))
  )
  private[this] lazy val controllers_CourseController_createCourse4_invoker = createInvoker(
    CourseController_10.createCourse(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "createCourse",
      Nil,
      "POST",
      this.prefix + """course/""",
      """CourseController""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CourseController_getCourse5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseController_getCourse5_invoker = createInvoker(
    CourseController_10.getCourse(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "getCourse",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """course/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CourseController_updateCourse6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseController_updateCourse6_invoker = createInvoker(
    CourseController_10.updateCourse(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "updateCourse",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """course/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CourseController_deleteCourse7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseController_deleteCourse7_invoker = createInvoker(
    CourseController_10.deleteCourse(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "deleteCourse",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """course/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CartController_createCart8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/")))
  )
  private[this] lazy val controllers_CartController_createCart8_invoker = createInvoker(
    CartController_2.createCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "createCart",
      Nil,
      "POST",
      this.prefix + """cart/""",
      """CartController""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CartController_getCart9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_getCart9_invoker = createInvoker(
    CartController_2.getCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCart",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CartController_updateCart10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_updateCart10_invoker = createInvoker(
    CartController_2.updateCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCart",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CartController_deleteCart11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_deleteCart11_invoker = createInvoker(
    CartController_2.deleteCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "deleteCart",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CategoryController_createCategory12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/")))
  )
  private[this] lazy val controllers_CategoryController_createCategory12_invoker = createInvoker(
    CategoryController_7.createCategory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "createCategory",
      Nil,
      "POST",
      this.prefix + """category/""",
      """CategoryController""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CategoryController_getCategory13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_getCategory13_invoker = createInvoker(
    CategoryController_7.getCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CategoryController_updateCategory14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_updateCategory14_invoker = createInvoker(
    CategoryController_7.updateCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategory",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CategoryController_deleteCategory15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategory15_invoker = createInvoker(
    CategoryController_7.deleteCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategory",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ClassroomController_createClassroom16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/")))
  )
  private[this] lazy val controllers_ClassroomController_createClassroom16_invoker = createInvoker(
    ClassroomController_4.createClassroom(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "createClassroom",
      Nil,
      "POST",
      this.prefix + """classroom/""",
      """ClassroomController""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ClassroomController_getClassroom17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_getClassroom17_invoker = createInvoker(
    ClassroomController_4.getClassroom(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "getClassroom",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """classroom/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ClassroomController_updateClassroom18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_updateClassroom18_invoker = createInvoker(
    ClassroomController_4.updateClassroom(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "updateClassroom",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """classroom/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ClassroomController_deleteClassroom19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_deleteClassroom19_invoker = createInvoker(
    ClassroomController_4.deleteClassroom(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "deleteClassroom",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """classroom/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_CommentController_createComment20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/")))
  )
  private[this] lazy val controllers_CommentController_createComment20_invoker = createInvoker(
    CommentController_6.createComment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "createComment",
      Nil,
      "POST",
      this.prefix + """comment/""",
      """CommentController""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_CommentController_getComment21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_getComment21_invoker = createInvoker(
    CommentController_6.getComment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "getComment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """comment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_CommentController_updateComment22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_updateComment22_invoker = createInvoker(
    CommentController_6.updateComment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "updateComment",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """comment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CommentController_deleteComment23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_deleteComment23_invoker = createInvoker(
    CommentController_6.deleteComment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "deleteComment",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """comment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_DiscountController_createDiscount24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/")))
  )
  private[this] lazy val controllers_DiscountController_createDiscount24_invoker = createInvoker(
    DiscountController_11.createDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "createDiscount",
      Nil,
      "POST",
      this.prefix + """discount/""",
      """DiscountController""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_DiscountController_getDiscount25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscount25_invoker = createInvoker(
    DiscountController_11.getDiscount(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscount",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_DiscountController_updateDiscount26_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_updateDiscount26_invoker = createInvoker(
    DiscountController_11.updateDiscount(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscount",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_DiscountController_deleteDiscount27_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscount27_invoker = createInvoker(
    DiscountController_11.deleteDiscount(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscount",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_OrderController_createOrder28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/")))
  )
  private[this] lazy val controllers_OrderController_createOrder28_invoker = createInvoker(
    OrderController_3.createOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "createOrder",
      Nil,
      "POST",
      this.prefix + """order/""",
      """OrderController""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_OrderController_getOrder29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrder29_invoker = createInvoker(
    OrderController_3.getOrder(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_OrderController_updateOrder30_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_updateOrder30_invoker = createInvoker(
    OrderController_3.updateOrder(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrder",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_OrderController_deleteOrder31_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrder31_invoker = createInvoker(
    OrderController_3.deleteOrder(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrder",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_ProfileController_createProfile32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/")))
  )
  private[this] lazy val controllers_ProfileController_createProfile32_invoker = createInvoker(
    ProfileController_0.createProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """profile/""",
      """ProfileController""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_ProfileController_getProfile33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfile33_invoker = createInvoker(
    ProfileController_0.getProfile(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getProfile",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """profile/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_ProfileController_updateProfile34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_updateProfile34_invoker = createInvoker(
    ProfileController_0.updateProfile(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "updateProfile",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """profile/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_ProfileController_deleteProfile35_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_deleteProfile35_invoker = createInvoker(
    ProfileController_0.deleteProfile(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "deleteProfile",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """profile/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_ReviewController_createReview36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/")))
  )
  private[this] lazy val controllers_ReviewController_createReview36_invoker = createInvoker(
    ReviewController_5.createReview(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "createReview",
      Nil,
      "POST",
      this.prefix + """review/""",
      """ReviewController""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_ReviewController_getReview37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewController_getReview37_invoker = createInvoker(
    ReviewController_5.getReview(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "getReview",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """review/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_ReviewController_updateReview38_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewController_updateReview38_invoker = createInvoker(
    ReviewController_5.updateReview(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "updateReview",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """review/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ReviewController_deleteReview39_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewController_deleteReview39_invoker = createInvoker(
    ReviewController_5.deleteReview(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "deleteReview",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """review/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_BasicController_index40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_BasicController_index40_invoker = createInvoker(
    BasicController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasicController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Assets_versioned41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned41_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_UserController_createUser0_route(params@_) =>
      call { 
        controllers_UserController_createUser0_invoker.call(UserController_8.createUser())
      }
  
    // @LINE:9
    case controllers_UserController_getUser1_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_getUser1_invoker.call(UserController_8.getUser(id))
      }
  
    // @LINE:10
    case controllers_UserController_updateUser2_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_updateUser2_invoker.call(UserController_8.updateUser(id))
      }
  
    // @LINE:11
    case controllers_UserController_deleteUser3_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_deleteUser3_invoker.call(UserController_8.deleteUser(id))
      }
  
    // @LINE:14
    case controllers_CourseController_createCourse4_route(params@_) =>
      call { 
        controllers_CourseController_createCourse4_invoker.call(CourseController_10.createCourse())
      }
  
    // @LINE:15
    case controllers_CourseController_getCourse5_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CourseController_getCourse5_invoker.call(CourseController_10.getCourse(id))
      }
  
    // @LINE:16
    case controllers_CourseController_updateCourse6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CourseController_updateCourse6_invoker.call(CourseController_10.updateCourse(id))
      }
  
    // @LINE:17
    case controllers_CourseController_deleteCourse7_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CourseController_deleteCourse7_invoker.call(CourseController_10.deleteCourse(id))
      }
  
    // @LINE:20
    case controllers_CartController_createCart8_route(params@_) =>
      call { 
        controllers_CartController_createCart8_invoker.call(CartController_2.createCart())
      }
  
    // @LINE:21
    case controllers_CartController_getCart9_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CartController_getCart9_invoker.call(CartController_2.getCart(id))
      }
  
    // @LINE:22
    case controllers_CartController_updateCart10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CartController_updateCart10_invoker.call(CartController_2.updateCart(id))
      }
  
    // @LINE:23
    case controllers_CartController_deleteCart11_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CartController_deleteCart11_invoker.call(CartController_2.deleteCart(id))
      }
  
    // @LINE:26
    case controllers_CategoryController_createCategory12_route(params@_) =>
      call { 
        controllers_CategoryController_createCategory12_invoker.call(CategoryController_7.createCategory())
      }
  
    // @LINE:27
    case controllers_CategoryController_getCategory13_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CategoryController_getCategory13_invoker.call(CategoryController_7.getCategory(id))
      }
  
    // @LINE:28
    case controllers_CategoryController_updateCategory14_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CategoryController_updateCategory14_invoker.call(CategoryController_7.updateCategory(id))
      }
  
    // @LINE:29
    case controllers_CategoryController_deleteCategory15_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CategoryController_deleteCategory15_invoker.call(CategoryController_7.deleteCategory(id))
      }
  
    // @LINE:32
    case controllers_ClassroomController_createClassroom16_route(params@_) =>
      call { 
        controllers_ClassroomController_createClassroom16_invoker.call(ClassroomController_4.createClassroom())
      }
  
    // @LINE:33
    case controllers_ClassroomController_getClassroom17_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ClassroomController_getClassroom17_invoker.call(ClassroomController_4.getClassroom(id))
      }
  
    // @LINE:34
    case controllers_ClassroomController_updateClassroom18_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ClassroomController_updateClassroom18_invoker.call(ClassroomController_4.updateClassroom(id))
      }
  
    // @LINE:35
    case controllers_ClassroomController_deleteClassroom19_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ClassroomController_deleteClassroom19_invoker.call(ClassroomController_4.deleteClassroom(id))
      }
  
    // @LINE:38
    case controllers_CommentController_createComment20_route(params@_) =>
      call { 
        controllers_CommentController_createComment20_invoker.call(CommentController_6.createComment())
      }
  
    // @LINE:39
    case controllers_CommentController_getComment21_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_getComment21_invoker.call(CommentController_6.getComment(id))
      }
  
    // @LINE:40
    case controllers_CommentController_updateComment22_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_updateComment22_invoker.call(CommentController_6.updateComment(id))
      }
  
    // @LINE:41
    case controllers_CommentController_deleteComment23_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_deleteComment23_invoker.call(CommentController_6.deleteComment(id))
      }
  
    // @LINE:44
    case controllers_DiscountController_createDiscount24_route(params@_) =>
      call { 
        controllers_DiscountController_createDiscount24_invoker.call(DiscountController_11.createDiscount())
      }
  
    // @LINE:45
    case controllers_DiscountController_getDiscount25_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DiscountController_getDiscount25_invoker.call(DiscountController_11.getDiscount(id))
      }
  
    // @LINE:46
    case controllers_DiscountController_updateDiscount26_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DiscountController_updateDiscount26_invoker.call(DiscountController_11.updateDiscount(id))
      }
  
    // @LINE:47
    case controllers_DiscountController_deleteDiscount27_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscount27_invoker.call(DiscountController_11.deleteDiscount(id))
      }
  
    // @LINE:50
    case controllers_OrderController_createOrder28_route(params@_) =>
      call { 
        controllers_OrderController_createOrder28_invoker.call(OrderController_3.createOrder())
      }
  
    // @LINE:51
    case controllers_OrderController_getOrder29_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_OrderController_getOrder29_invoker.call(OrderController_3.getOrder(id))
      }
  
    // @LINE:52
    case controllers_OrderController_updateOrder30_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_OrderController_updateOrder30_invoker.call(OrderController_3.updateOrder(id))
      }
  
    // @LINE:53
    case controllers_OrderController_deleteOrder31_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_OrderController_deleteOrder31_invoker.call(OrderController_3.deleteOrder(id))
      }
  
    // @LINE:56
    case controllers_ProfileController_createProfile32_route(params@_) =>
      call { 
        controllers_ProfileController_createProfile32_invoker.call(ProfileController_0.createProfile())
      }
  
    // @LINE:57
    case controllers_ProfileController_getProfile33_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_getProfile33_invoker.call(ProfileController_0.getProfile(id))
      }
  
    // @LINE:58
    case controllers_ProfileController_updateProfile34_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_updateProfile34_invoker.call(ProfileController_0.updateProfile(id))
      }
  
    // @LINE:59
    case controllers_ProfileController_deleteProfile35_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_deleteProfile35_invoker.call(ProfileController_0.deleteProfile(id))
      }
  
    // @LINE:62
    case controllers_ReviewController_createReview36_route(params@_) =>
      call { 
        controllers_ReviewController_createReview36_invoker.call(ReviewController_5.createReview())
      }
  
    // @LINE:63
    case controllers_ReviewController_getReview37_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ReviewController_getReview37_invoker.call(ReviewController_5.getReview(id))
      }
  
    // @LINE:64
    case controllers_ReviewController_updateReview38_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ReviewController_updateReview38_invoker.call(ReviewController_5.updateReview(id))
      }
  
    // @LINE:65
    case controllers_ReviewController_deleteReview39_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ReviewController_deleteReview39_invoker.call(ReviewController_5.deleteReview(id))
      }
  
    // @LINE:71
    case controllers_BasicController_index40_route(params@_) =>
      call { 
        controllers_BasicController_index40_invoker.call(BasicController_1.index())
      }
  
    // @LINE:74
    case controllers_Assets_versioned41_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned41_invoker.call(Assets_9.versioned(path, file))
      }
  }
}
