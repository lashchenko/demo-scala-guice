package ua.scala.guice

import com.google.inject.{Scope, Guice, AbstractModule}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import net.codingwell.scalaguice.ScalaModule

trait DemoGuiceModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
//    bind[DemoService].to[DemoServiceImpl].in(Scope.)
    bind[DemoService].to[DemoServiceImpl]
  }
}

trait DemoGuiceInjector {
  lazy val injector: ScalaInjector = DemoGuiceInjector.injector
}

object DemoGuiceInjector {
  lazy val injector: ScalaInjector = Guice.createInjector(new DemoGuiceModule {})
}