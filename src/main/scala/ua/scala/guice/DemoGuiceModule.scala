package ua.scala.guice

import com.google.inject.{AbstractModule, Guice}
import com.google.inject.name.Names
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import net.codingwell.scalaguice.ScalaModule

class DemoGuiceModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[DemoService].to[DemoServiceImpl]
    bind[String].annotatedWith(Names.named("color")).toInstance("realColor")
    bind[String].annotatedWith(Names.named("info")).toInstance("realInfo")
    bind[DemoContainer.type].toInstance(DemoContainer)
  }
}

trait DemoGuiceInjector extends InjectorBase {
  override lazy val injector: ScalaInjector = DemoGuiceInjector.injector
}

object DemoGuiceInjector {
  lazy val injector: ScalaInjector = Guice.createInjector(new DemoGuiceModule {})
}