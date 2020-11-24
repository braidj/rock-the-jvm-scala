package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name:String, favouriteFilm: String) {

    def likesMovie(movie: String): Boolean = movie == favouriteFilm  // infix notation

    def +(person: Person): String = s"${this.name} hangs out with ${person.name}" // method operator

    def unary_! : String = "What the heck"// need a space before : other wise compiler will think it is part of the method name

    def isAlive: Boolean = true // methods with no parameters can be used for PostFixNotation

    def apply(): String = s" Hi, my name is $name and I like $favouriteFilm" // Apply, methd name VERY important

  }

  val mary = new Person("Mary","Jaws")
  val mark = new Person("Mark","About Time" )

  println(mary.likesMovie("The killing game"))
  println(mary likesMovie "The killing game") // Infix notation (only for 1 parameter methods

  //println(mary hangsOutWith mark) // methods can be called another, so if rename +
  println(mary + mark) // Operators in Scala are just methods

  println(!mary) // Prefix notation, but only works with 4 operators: = - ! and ~
  println(mary.unary_!) // equivalent

  // Post Fix notation, but is rarely used in practice
  println(mary isAlive)

  // Apply
  println(mary.apply())
  println(mary()) // equivalent syntactic sugar. treats mary like a function, calling the special method of Apply


  //Syntactic sugar exercises
  // 1. Overload the + operator, MAry + "the rockstar" => new person "MAry (the rockstar)"

  // 2. Add age to Person class. Add nary + operator => new person with age + 1
  // +mary => mary with age incremented

  // 3. Add a "learns" method in person class => MAry learns 'Scala'
  // then add a learnsScala method, calls above with Scala. Use it in postfix notation

  // 4. Overload the apply method
  // receives a nos, output => "Mary watched <movie> <2> times"

}
