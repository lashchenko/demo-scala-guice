package ua.scala.guice

import ua.scala.guice.InjectorContainer.injector

object DemoApp extends App {
  val worker = injector.instance[DemoWorker]

  println(worker.service.get(100))
  println(DemoContainer.color)
  println(new DemoInfoContainer().info)
}
