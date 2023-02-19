

import exmplclss.Person
import pckfnc.alert.printAlertMessage
import pckfnc.multiplication.multipleIntegers;

object Main {

  private def increment(a: Int): Int = a + 1;

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val pnt = Point(10, 10); // create instance object point
    pnt.move(20, 20); // move point
    pnt.move(increment(20), increment(8)); // move point
    printAlertMessage();
    multipleIntegers(10, 20);
    initPerson()
    val pnt3: Point_3 = Point_3(10, 10)
    pnt3.move(12,17)
    println(pnt3.toString())
  }
  private def initPerson(): Unit = {
    val person = Person();
    person.age = 50;
    person.lastName = "Last"
    person.firstName="Name"
    println(person.toString())

  }
}