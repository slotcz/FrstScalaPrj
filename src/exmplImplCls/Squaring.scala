package exmplImplCls

/**
 * Simple object that provides multiplication.
 *
 */

object Squaring {

  implicit class Squarer(x: Int) {
    def numberSquaring[A](f: => A): Unit = {
      println {
        x + " * " + x + " = " + x * x
      }
    }
  }
}