package exmplclss

class Person(
              var firstName: String,
              var lastName: String,
              var age: Int
            ):
  // zero-arg auxiliary constructor
  def this() = this("", "", 0)

  // one-arg auxiliary constructor
  def this(firstName: String) =
    this(firstName, "", 0)

  // two-arg auxiliary constructor
  def this(
            firstName: String,
            lastName: String
          ) =
    this(firstName, lastName, 0)

  override def toString: String = {
    firstName + " " + lastName + " " + age
  }
end Person