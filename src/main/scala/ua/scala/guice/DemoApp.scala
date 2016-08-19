package ua.scala.guice

object DemoApp extends App {
  val worker = new DemoWorker
  println(worker.service.get(100))
}
