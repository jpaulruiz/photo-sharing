package models.domain

case class Comment(id: Long, postId: Long, userId: String, comment: String)
case class PostComment(id: Long, userId: Option[String], comment: Option[String])
