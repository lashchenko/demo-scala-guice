package ua.scala.guice

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import net.codingwell.scalaguice.ScalaModule

class TestGuiceModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[DemoService].to[DemoServiceTest]
    bind[String].annotatedWith(Names.named("color")).toInstance("testColor")
    bind[DemoContainer.type].toInstance(DemoContainer)
  }
}