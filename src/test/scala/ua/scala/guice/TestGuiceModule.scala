package ua.scala.guice

import com.google.inject.name.Names
import com.google.inject.{AbstractModule, Guice}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import net.codingwell.scalaguice.ScalaModule

class TestGuiceModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[DemoService].to[DemoServiceTest]
    bind[String].annotatedWith(Names.named("color")).toInstance("testColor")
    bind[String].annotatedWith(Names.named("info")).toInstance("testInfo")
    bind[DemoContainer.type].toInstance(DemoContainer)
  }
}

trait TestGuiceInjector extends InjectorBase {
  override lazy val injector: ScalaInjector = TestGuiceInjector.injector
}

object TestGuiceInjector {
  lazy val injector: ScalaInjector = Guice.createInjector(new TestGuiceModule)
}
