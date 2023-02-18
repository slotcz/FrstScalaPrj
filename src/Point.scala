import java.io._

class Point(xc: Int, yc: Int) {
  private var x: Int = xc
  private var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("Point x location : " + x)
    println("Point y location : " + y)
  }
}