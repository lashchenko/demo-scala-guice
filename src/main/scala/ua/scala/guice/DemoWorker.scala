package ua.scala.guice

class DemoWorker extends DemoGuiceInjector {
  val service = injector.instance[DemoService]
}
