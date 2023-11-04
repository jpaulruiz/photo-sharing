file://<WORKSPACE>/app/controllers/PostController.scala
### scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$CaseDef
case Some((username @ _)) => post.<get: error>.<map: error>(((t) => t.map(((p) => Ok(Json.toJson(Post(p.id, p.userId, p.url, p.description, p.img, p.ext)))))))
     while compiling: file://<WORKSPACE>/app/controllers/PostController.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -deprecation -encoding utf8 -unchecked -Wconf:cat=unchecked:w -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/conf:<HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.6/semanticdb-javac-0.9.6.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/twirl-api_2.13/1.5.1/twirl-api_2.13-1.5.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-server_2.13/2.8.20/play-server_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-logback_2.13/2.8.20/play-logback_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-akka-http-server_2.13/2.8.20/play-akka-http-server_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/filters-helpers_2.13/2.8.20/filters-helpers_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-guice_2.13/2.8.20/play-guice_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-slick_2.13/5.0.0/play-slick_2.13-5.0.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/h2database/h2/1.4.197/h2-1.4.197.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.13/1.3.1/scala-xml_2.13-1.3.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play_2.13/2.8.20/play_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.2.12/logback-classic-1.2.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-streams_2.13/2.8.20/play-streams_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.1.15/akka-http-core_2.13-10.1.15.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/guice/4.2.3/guice-4.2.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/extensions/guice-assistedinject/4.2.3/guice-assistedinject-4.2.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick_2.13/3.3.2/slick_2.13-3.3.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick-hikaricp_2.13/3.3.2/slick-hikaricp_2.13-3.3.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-jdbc-api_2.13/2.8.0/play-jdbc-api_2.13-2.8.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/build-link/2.8.20/build-link-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jul-to-slf4j/1.7.36/jul-to-slf4j-1.7.36.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jcl-over-slf4j/1.7.36/jcl-over-slf4j-1.7.36.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.21/akka-actor_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor-typed_2.13/2.6.21/akka-actor-typed_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-slf4j_2.13/2.6.21/akka-slf4j_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-serialization-jackson_2.13/2.6.21/akka-serialization-jackson_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.4/jackson-core-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.4/jackson-annotations-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.11.4/jackson-datatype-jdk8-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.11.4/jackson-datatype-jsr310-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.4/jackson-databind-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-json_2.13/2.8.2/play-json_2.13-2.8.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/guava/30.1.1-jre/guava-30.1.1-jre.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt/0.9.1/jjwt-0.9.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/2.3.3/jakarta.xml.bind-api-2.3.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/transaction/jakarta.transaction-api/1.3.3/jakarta.transaction-api-1.3.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/1.0.2/scala-java8-compat_2.13-1.0.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.3/ssl-config-core_2.13-0.4.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.2.12/logback-core-1.2.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.21/akka-stream_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.1.15/akka-parsing_2.13-10.1.15.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.13/2.0.0/scala-collection-compat_2.13-2.0.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/3.2.0/HikariCP-3.2.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-exceptions/2.8.20/play-exceptions-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.4/jackson-module-parameter-names-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.4/jackson-dataformat-cbor-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-scala_2.13/2.11.4/jackson-module-scala_2.13-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-functional_2.13/2.8.2/play-functional_2.13-2.8.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.12/scala-reflect-2.13.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.5/joda-time-2.10.5.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.8.0/checker-qual-3.8.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.5.1/error_prone_annotations-2.5.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/activation/jakarta.activation-api/1.2.2/jakarta.activation-api-1.2.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.21/akka-protobuf-v3_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-paranamer/2.11.4/jackson-module-paranamer-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: CaseDef
       tree position: line 41 of file://<WORKSPACE>/app/controllers/PostController.scala
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==

    38 
    39   def get() = Action.async { implicit request =>
    40     request.session.get("username") match {
    41         case Some(username) => {
    42         //   post.get.flatMap( t => {
    43         //         user.get.flatMap ( t2 => {
    44         //             comment.getCombinedQueries.map( t3 => {

occurred in the presentation compiler.

action parameters:
offset: 1323
uri: file://<WORKSPACE>/app/controllers/PostController.scala
text:
```scala
package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.domain._
import models.repo._
import java.nio.file._
import scala.concurrent._
import play.api.libs.json._

@Singleton
class PostController @Inject()(val controllerComponents: ControllerComponents,
  val post: PostRepo,
  val comment: CommentRepo,
  val user: UserRepo)
  (implicit val ec: ExecutionContext) extends BaseController {

//   def index() = Action { implicit request: Request[AnyContent] =>
//     request.session.get("username") match {
//         case Some(username) =>
//             Ok(views.html.index(username))
//         case None =>
//             Redirect(routes.AuthController.get())
//     }
//   }

  val commentForm = Form(
    tuple(
        "id" -> default(longNumber, 0L),
        "postId" -> default(longNumber, 0L),
        "userId" -> nonEmptyText,
        "comment" -> nonEmptyText,
    )
  )

  def get() = Action.async { implicit request =>
    request.session.get("username") match {
        case Some(username) => {
        //   post.get.flatMap( t => {
        //         user.get.flatMap ( t2 => {
        //             comment.getCombinedQueries.map( t3 => {
        //             //   println(t3)
        //             //   Ok(vie@@ws.html.post(username, t, t2, t3, commentForm))
                        
        //             })
        //         })
        //     })
            post.get.map( t => {
                t.map( p => {
                    Ok(Json.toJson(Post(p.id, p.userId, p.url, p.description, p.img, p.ext)))
                })

            })
        }
        case None =>
            // Future(Redirect(routes.AuthController.get()))
            Ok(JsObject(Seq("message" -> JsString("Logon first."))))
    }
  }

  def create() = Action(parse.multipartFormData) { implicit request =>
    println(request.body.dataParts)
    if (request.body.files.size > 0) {
      request.body
        .file("url")
        .map { picture =>
          val imageBytes = Files.readAllBytes(picture.ref.path)
          val filename = Paths.get(picture.filename).getFileName
          val filesize = picture.fileSize
          val filetype = picture.contentType
          request.body.dataParts("desc").map( desc => {
              // post.get.map( l => {
              //   Post(l.size + 1L,
              //     Some(filename.toString()),
              //     desc,
              //     Some(imageBytes),
              //     filetype)
              //     post.create(p)
              // })
              // val p = Post(post.g,
              //   Some(filename.toString()),
              //   desc,
              //   Some(imageBytes),
              //   filetype)
              // post.create(p)
              desc
            }
          )
        }
      Ok(JsObject(Seq("message" -> JsString("Post successfully created1."))))
    } else {
      // println(request.body.dataParts("description"))
      // Redirect(routes.PhotoController.index()).flashing("error" -> "No file was uploaded.")
      request.body.dataParts("desc").map( desc => {
             post.get.map( l => {
                post.create(
                  Post(l.size + 1L,
                    request.body.dataParts("userId").head,
                    None,
                    desc,
                    None,
                    None)
                )
            })
      })
       Ok(JsObject(Seq("message" -> JsString("Post successfully created2."))))
    }
  }
}

```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:70)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:66)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.tools.nsc.typechecker.Typers$Typer.typedOutsidePatternMode$1(Typers.scala:6090)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6107)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedQualifier(Typers.scala:6251)
	scala.meta.internal.pc.PcDefinitionProvider.definitionTypedTreeAt(PcDefinitionProvider.scala:160)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:68)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:321)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$CaseDef
case Some((username @ _)) => post.<get: error>.<map: error>(((t) => t.map(((p) => Ok(Json.toJson(Post(p.id, p.userId, p.url, p.description, p.img, p.ext)))))))
     while compiling: file://<WORKSPACE>/app/controllers/PostController.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -deprecation -encoding utf8 -unchecked -Wconf:cat=unchecked:w -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/conf:<HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.6/semanticdb-javac-0.9.6.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/twirl-api_2.13/1.5.1/twirl-api_2.13-1.5.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-server_2.13/2.8.20/play-server_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-logback_2.13/2.8.20/play-logback_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-akka-http-server_2.13/2.8.20/play-akka-http-server_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/filters-helpers_2.13/2.8.20/filters-helpers_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-guice_2.13/2.8.20/play-guice_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-slick_2.13/5.0.0/play-slick_2.13-5.0.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/h2database/h2/1.4.197/h2-1.4.197.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.13/1.3.1/scala-xml_2.13-1.3.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play_2.13/2.8.20/play_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.2.12/logback-classic-1.2.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-streams_2.13/2.8.20/play-streams_2.13-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.1.15/akka-http-core_2.13-10.1.15.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/guice/4.2.3/guice-4.2.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/extensions/guice-assistedinject/4.2.3/guice-assistedinject-4.2.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick_2.13/3.3.2/slick_2.13-3.3.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick-hikaricp_2.13/3.3.2/slick-hikaricp_2.13-3.3.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-jdbc-api_2.13/2.8.0/play-jdbc-api_2.13-2.8.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/build-link/2.8.20/build-link-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jul-to-slf4j/1.7.36/jul-to-slf4j-1.7.36.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jcl-over-slf4j/1.7.36/jcl-over-slf4j-1.7.36.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.21/akka-actor_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor-typed_2.13/2.6.21/akka-actor-typed_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-slf4j_2.13/2.6.21/akka-slf4j_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-serialization-jackson_2.13/2.6.21/akka-serialization-jackson_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.4/jackson-core-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.4/jackson-annotations-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.11.4/jackson-datatype-jdk8-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.11.4/jackson-datatype-jsr310-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.4/jackson-databind-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-json_2.13/2.8.2/play-json_2.13-2.8.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/guava/30.1.1-jre/guava-30.1.1-jre.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt/0.9.1/jjwt-0.9.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/2.3.3/jakarta.xml.bind-api-2.3.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/transaction/jakarta.transaction-api/1.3.3/jakarta.transaction-api-1.3.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/1.0.2/scala-java8-compat_2.13-1.0.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.3/ssl-config-core_2.13-0.4.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.2.12/logback-core-1.2.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.21/akka-stream_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.1.15/akka-parsing_2.13-10.1.15.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.13/2.0.0/scala-collection-compat_2.13-2.0.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/3.2.0/HikariCP-3.2.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-exceptions/2.8.20/play-exceptions-2.8.20.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.4/jackson-module-parameter-names-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.4/jackson-dataformat-cbor-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-scala_2.13/2.11.4/jackson-module-scala_2.13-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-functional_2.13/2.8.2/play-functional_2.13-2.8.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.12/scala-reflect-2.13.12.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/joda-time/joda-time/2.10.5/joda-time-2.10.5.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.8.0/checker-qual-3.8.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.5.1/error_prone_annotations-2.5.1.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/activation/jakarta.activation-api/1.2.2/jakarta.activation-api-1.2.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.21/akka-protobuf-v3_2.13-2.6.21.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-paranamer/2.11.4/jackson-module-paranamer-2.11.4.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: CaseDef
       tree position: line 41 of file://<WORKSPACE>/app/controllers/PostController.scala
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==

    38 
    39   def get() = Action.async { implicit request =>
    40     request.session.get("username") match {
    41         case Some(username) => {
    42         //   post.get.flatMap( t => {
    43         //         user.get.flatMap ( t2 => {
    44         //             comment.getCombinedQueries.map( t3 => {