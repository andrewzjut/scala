package com.tairan.zt.test.day1

/**
 * Created by hzzt on 2016/7/11.
 */
object Sharp {
  case class Point(x: Double = 0.0, y: Double = 0.0) {

    def shift(deltax: Double = 0.0, deltay: Double = 0.0) =
      copy (x + deltax, y + deltay)
  }
  abstract class Shape() {
    /**
     * Draw takes TWO argument LISTS, one list with an offset for drawing,
     * and the other list that is the function argument we used previously.
     */
    def draw(offset: Point = Point(0.0, 0.0))(f: String => Unit): Unit =
      f(s"draw(offset = $offset), ${this.toString}")
  }

  case class Circle(center: Point, radius: Double) extends Shape

  case class Rectangle(lowerLeft: Point, height: Double, width: Double)
    extends Shape

  def main(args: Array[String]) {
    val p = new Point(0.0,1.0)
    val circle = new Circle(p,1)
    circle.draw(Point(1.0,2.0))(str=>println(s"ShapesDrawingActor:$str"))
  }
}
