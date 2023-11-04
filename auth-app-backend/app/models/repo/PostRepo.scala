package models.repo

import models.domain.Post
import models.repo.UserRepo
import javax.inject._
import slick.jdbc.JdbcProfile
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}

@Singleton
class PostRepo @Inject()(val dbConfigProvider: DatabaseConfigProvider)
    (val user: UserRepo) extends HasDatabaseConfigProvider[JdbcProfile] {

    import profile.api._

    case class PostTable(tag: Tag) extends Table[Post](tag, "post") {
        def id = column[Long]("id")
        def userId = column[String]("user_id")
        def url = column[Option[String]]("url")
        def description = column[String]("description")
        def img = column[Option[Array[Byte]]]("img")
        def ext = column[Option[String]]("ext")

        def * = (id, userId, url, description, img, ext).mapTo[Post]
        def pk = primaryKey("pk_post", (id, userId))
        // def fk = foreignKey("fk_post", userId, user.query)(_.username)
    }

    val query = TableQuery[PostTable]

    db.run(
        query.schema.createIfNotExists
    )

    def create(param: Post) = db.run(
        query += param
    )

    def get = db.run(
        query.result
    )
}