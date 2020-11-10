package part1basics

object Functions extends App {

  println("Whoop whoop")
  def aFunction(a: String,b: Int): String = {
    a + " " + b
  }

  println(aFunction ("god", 20))
}