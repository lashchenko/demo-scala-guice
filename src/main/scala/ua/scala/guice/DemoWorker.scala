package ua.scala.guice

import com.google.inject.Inject

class DemoWorker @Inject()(val service: DemoService) {
}
