package lectures.part2oop

object MethodNotations extends App {

  class Person(val name:String, favouriteFilm: String) {
    def likesMovie(movie: String): Boolean = movie == favouriteFilm

    def +(person: Person): String = s"${this.name} hangs out with ${person.name}"

  }

  val mary = new Person("Mary","Jaws")
  val mark = new Person("Mark","About Time" )

  println(mary.likesMovie("The killing game"))
  println(mary likesMovie "The killing game") // Infix notation (only for 1 parameter methods

  //println(mary hangsOutWith mark) // methods can be called another, so if rename +
  println(mary + mark) // Operators in Scala are just methods

  //Syntactic sugar exercises

}
