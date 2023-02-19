import java.io.*

// it is class point, init and move
class Point(xc: Int, yc: Int) {
  private var x: Int = xc
  private var y: Int = yc

  // comment for method move point
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("Point x location : " + x)
    println("Point y location : " + y)
  }
}