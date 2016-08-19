package ua.scala.guice

import org.scalatest.{Matchers, WordSpec}

class DemoWorkerTest extends WordSpec with Matchers {

  "DemoWorker" should {
    "override DemoService with TestGuiceModule" in new TestGuiceInjector {
      val worker = injector.instance[DemoWorker]
      worker.service.get(10) shouldBe "TEST"
      DemoContainer.color shouldBe "testColor"
      (new DemoInfoContainer with TestGuiceInjector).info shouldBe "testInfo"
    }

    "doesn't override DemoService without TestGuiceModule" in new DemoGuiceInjector {
      val worker = injector.instance[DemoWorker]
      worker.service.get(10) shouldBe "A"
      DemoContainer.color shouldBe "realColor"
      (new DemoInfoContainer with DemoGuiceInjector).info shouldBe "realInfo"
    }
  }
}
