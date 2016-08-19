package ua.scala.guice

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector

object DemoApp extends App {
  val injector: ScalaInjector = Guice.createInjector(new DemoGuiceModule)
  val worker = injector.instance[DemoWorker]

  println(worker.service.get(100))
  println(DemoContainer.color)
}
