import Dependencies._

version := "1.0"

lazy val root = (project in file(".")).
  dependsOn(RootProject(file("../lift"))).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "LiftSample",
    libraryDependencies += scalaTest % Test
  )
