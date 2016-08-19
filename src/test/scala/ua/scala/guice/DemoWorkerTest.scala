package ua.scala.guice

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import org.scalatest.{Matchers, WordSpec}

class DemoWorkerTest extends WordSpec with Matchers {

  "DemoWorker" should {
    "override DemoService with TestGuiceModule" in {
      val injector: ScalaInjector = Guice.createInjector(new TestGuiceModule)
      val worker = injector.instance[DemoWorker]
      worker.service.get(10) shouldBe "TEST"
      DemoContainer.color shouldBe "testColor"
      new DemoInfoContainer().info shouldBe "testInfo"
    }
    "doesn't override DemoService without TestGuiceModule" in {
      val injector: ScalaInjector = Guice.createInjector(new DemoGuiceModule)
      val worker = injector.instance[DemoWorker]
      worker.service.get(10) shouldBe "A"
      DemoContainer.color shouldBe "realColor"
      new DemoInfoContainer().info shouldBe "realInfo"
    }
  }
}
