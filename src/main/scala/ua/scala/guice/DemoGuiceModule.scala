package ua.scala.guice

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import net.codingwell.scalaguice.ScalaModule

class DemoGuiceModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[DemoService].to[DemoServiceImpl]
    bind[String].annotatedWith(Names.named("color")).toInstance("realColor")
    bind[DemoContainer.type].toInstance(DemoContainer)
  }
}