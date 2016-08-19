package ua.scala.guice

class DemoServiceImpl extends DemoService {
  override def get(x: Int): String = x.toLong.toHexString.toUpperCase
}
