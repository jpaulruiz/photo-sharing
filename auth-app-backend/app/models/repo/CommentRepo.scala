package models.repo

import javax.inject._
import java.util.UUID
import slick.jdbc.JdbcProfile
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import scala.concurrent._
import models.domain._

@Singleton
class CommentRepo @Inject()(val dbConfigProvider: DatabaseConfigProvider,
    val post: PostRepo,
    val user: UserRepo)
    (implicit val ec: ExecutionContext) extends HasDatabaseConfigProvider[JdbcProfile] {

    import profile.api._

    case class CommentTable(tag: Tag) extends Table[Comment](tag, "post_comment") {
        def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
        def postId = column[Long]("post_id")
        def userId = column[String]("user_id")
        def comment = column[String]("comment")

        def * = (id, postId, userId, comment).mapTo[Comment]
        def fkPost = foreignKey("fk_post", postId, post.query)(_.id)
        def fkUser = foreignKey("fk_user", userId, user.query)(_.username)
    }

    val query = TableQuery[CommentTable]

    def schema = db.run(
        query.schema.createIfNotExists
    )

    def create(param: Comment) = db.run(
        query += param
    )

    // def get = db.run(
    //     post.query
    //         .joinLeft(query).on(_.id === _.postId)
    //         .map {
    //             case (post, comment) => (post.id, post.userId, comment.map(_.comment))
    //         }
    //         .result 
    // ).map(_.map {
    //     case (id, userId, comment) => PostComment(id, userId, comment)
    // })

    def get = db.run(
        query.result
    )

    def getCombinedQueries = db.run(
        post.query
            .joinLeft(query).on(_.id === _.postId)
            .joinLeft(user.query).on(_._1.userId === _.username)
            .map {
                case ((post, comment), user) => (post.id, comment.map(_.userId), comment.map(_.comment))
            }
            .result
    ).map(_.map {
        case (id, userId, comment) => PostComment(id, userId, comment)
    })

    def update(id: UUID) = ???

    def delete(id: UUID) = ???
}