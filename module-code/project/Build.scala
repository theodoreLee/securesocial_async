import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "securesocial"
    val appVersion      = "2.1-SNAPSHOT"

    val appDependencies = Seq(
      "com.typesafe" %% "play-plugins-util" % "2.1-SNAPSHOT",
      "com.typesafe" %% "play-plugins-mailer" % "2.1-SNAPSHOT",
      "org.mindrot" % "jbcrypt" % "0.3m"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
    ).settings(
      resolvers ++= Seq(
        Resolver.file("Local Repository", file("/usr/local/Cellar/play/2.1-RC1/libexec/repository/local"))(Resolver.ivyStylePatterns),
        "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
        "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
      )
    )

}
