package ua.scala.guice

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector

object InjectorContainer {
  val injector: ScalaInjector = Guice.createInjector(new DemoGuiceModule)
}
