ThisBuild / version := "0.1.0-SNAPSHOT"

//ThisBuild / scalaVersion := "3.1.1"
ThisBuild / scalaVersion := "2.12.9"

lazy val root = (project in file("."))
  .settings(
    name := "SCALA_DSC",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "3.2.1",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.1",
    libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.2.1",
    libraryDependencies += "org.apache.spark" %% "spark-graphx" % "3.2.1"
  )