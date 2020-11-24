package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Jon",26)
  println(person.age)
  println(person.x)
  println(person.greet("Daniel"))
  println(person.greet())

  val JB = new Writer("Jason", "Braid", 1969)
  println(JB.fullname)

  val firstBook = new Novel("Casually deliberate",1987,JB)

  println(firstBook.authorAge)
  println(firstBook.isWrittenBy)
  val newEdition = firstBook.copy(1998)
  println(newEdition.authorAge)

  val cnt = new Counter(7)

  cnt.increase.print // 7 + 1 = 8
  cnt.increase(5).print // 7 + 40 = 47

  cnt.decrease.print // 7 -1 = 6
  cnt.decrease(20).print // 7 - 20 = -13


}

// constructor
class Person(name: String, val age: Int) {
  // Classes are blueprints that describe the way things looks like -> data,
  // and the way that things work -> functionality or Behaviour
  //
  // class parameters are NOT FIELDS
  // To convert just add the key ord of val or var before the parameter

  // body, n.b. all expressions are evulated when a class is instantiated
  val x = 2 // these are fields

  println(1 + 3)

  // a def inside a class is called a Method, note use of this key word
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  //overloading
  def greet(): Unit = println(s"Hi I am $name")

  // multiple constructors
  // You can have auxilary constructors, but alot of the time can be replaced with defaults
  def this(name:String) = this(name,0)
  def this() = this("John Doe")

}

  /*
    Exercises
    Novel and a Writer classes

   */

class Writer(fName: String, lName: String, val age: Int) {
    def fullname: String = s"$fName $lName"
  }

class Novel(name:String, yor: Int, author: Writer) {

  def authorAge: Int = yor - author.age

  def isWrittenBy: String = this.author.fullname

  def copy(nyor: Int) = new Novel(name, nyor, author)

}

//Counter class
class Counter(val value: Int) {

  def increase = {
    println("incrementing")
    new Counter(value + 1)
  } // immutability

  def increase(amt:Int): Counter = {
    if (amt <= 0) this
    else increase.increase(amt-1)
  }

  def decrease  = {
    println("Decrementing")
    new Counter(value - 1)
  }

  def decrease(amt:Int): Counter = {
    if (amt <= 0) this
    else decrease.decrease(amt - 1)
  }

  def print: Unit = println(value)
}


