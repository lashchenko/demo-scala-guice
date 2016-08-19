package ua.scala.guice

import com.google.inject.{Guice, AbstractModule}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import net.codingwell.scalaguice.ScalaModule

class TestGuiceModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[DemoService].to[DemoServiceTest]
  }
}

trait TestGuiceInjector { self : DemoGuiceInjector =>
  override lazy val injector: ScalaInjector = TestGuiceInjector.injector
}

object TestGuiceInjector {
  lazy val injector: ScalaInjector = Guice.createInjector(new TestGuiceModule)
}
