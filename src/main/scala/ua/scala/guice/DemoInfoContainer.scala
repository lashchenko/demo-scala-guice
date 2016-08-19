package ua.scala.guice

import com.google.inject.name.Names

class DemoInfoContainer extends DemoGuiceInjector {
  val info = injector.instance[String](Names.named("info"))
}
