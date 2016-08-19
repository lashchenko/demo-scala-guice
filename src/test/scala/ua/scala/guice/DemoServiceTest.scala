package ua.scala.guice

class DemoServiceTest extends DemoService {
  override def get(x: Int): String = "TEST"
}
