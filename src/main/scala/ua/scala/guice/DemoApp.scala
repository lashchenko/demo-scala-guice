package ua.scala.guice

object DemoApp extends App with DemoGuiceInjector {
  val worker = injector.instance[DemoWorker]

  println(worker.service.get(100))
  println(DemoContainer.color)
  println(new DemoInfoContainer().info)
}
