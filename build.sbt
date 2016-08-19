
val project = Project(
  id = "demo-scala-guice",
  base = file("."),
  settings = Seq(
    name := "demo-scala-guice",
    scalaVersion := "2.11.8",
    
    libraryDependencies ++= Seq(
      "net.codingwell" %% "scala-guice" % "4.0.1",
      "com.google.inject" % "guice" % "4.1.0",
      "org.scalatest" %% "scalatest" % "2.2.1" % "test"
    ),

    parallelExecution in Test := false
  )
)
