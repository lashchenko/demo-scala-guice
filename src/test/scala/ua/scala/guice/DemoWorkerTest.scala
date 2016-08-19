package ua.scala.guice

import org.scalatest.{Matchers, WordSpec}

class DemoWorkerTest extends WordSpec with Matchers {

  "DemoWorker" should {
    "override DemoService with TestGuiceModule" in {
      val worker = new DemoWorker with TestGuiceInjector
      worker.service.get(10) shouldBe "TEST"
    }
    "doesn't override DemoService without TestGuiceModule" in {
      val worker = new DemoWorker
      worker.service.get(10) shouldBe "A"
    }
  }
}
