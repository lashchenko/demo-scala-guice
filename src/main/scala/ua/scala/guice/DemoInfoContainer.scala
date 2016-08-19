package ua.scala.guice

import com.google.inject.name.Names
import ua.scala.guice.InjectorContainer.injector

class DemoInfoContainer {
  val info = injector.instance[String](Names.named("info"))
}
