package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name:String, favouriteFilm: String, val age: Int = 0) {

    def likesMovie(movie: String): Boolean = movie == favouriteFilm  // infix notation

    def +(person: Person): String = s"${this.name} hangs out with ${person.name}" // method operator
    def +(nickname: String): Person = new Person(s"$name ($nickname)",favouriteFilm)

    def unary_! : String = "What the heck"// need a space before : other wise compiler will think it is part of the method name
    def unary_+ : Person = new Person(name, favouriteFilm, age + 1)

    def isAlive: Boolean = true // methods with no parameters can be used for PostFixNotation

    def learns(subject: String): String = s"$name learns $subject"

    //def learnsScala(): String = learns("Scala") //these to are equivalent
    def learnsScala = this learns "Scala"

    def apply(): String = s"Hi, my name is $name and I like $favouriteFilm" // Apply, method name VERY important
    def apply(times:Int) =  s"Hi, my name is $name and I watched $favouriteFilm $times times"

  }

  val mary = new Person("Mary","Jaws")
  val mark = new Person("Mark","About Time" )

  //println(mary.likesMovie("The killing game"))
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

  println("OUTPUT FROM EXERCISES\n")
  // 1. Overload the + operator, MAry + "the rockstar" => new person "MAry (the rockstar)"
  println((mary + "stinky pinky")()) // calls the apply method for the resulting expression

  // 2. Add age to Person class. Add unary + operator => new person with age + 1
  // +mary => mary with age incremented
  val steve = new Person("Steve","Star Wars",21)
  println((+steve).age) // should be 22, use 0f () means returns the expression, a person, then call the value age

  // 3. Add a "learns" method in person class => MAry learns 'Scala'
  // then add a learnsScala method, calls above with Scala. Use it in postfix notation
  println(mary.learns("Cross stick knitting"))
  println(mary learnsScala)

  // 4. Overload the apply method
  // receives a nos, output => "Mary watched <movie> <2> times"
  println(mary(10))
}
