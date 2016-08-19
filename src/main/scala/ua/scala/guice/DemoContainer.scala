package ua.scala.guice

import com.google.inject.Inject
import com.google.inject.name.Named

object DemoContainer {

  @Inject
  @Named("color") val color: String = "EMPTY"
}
