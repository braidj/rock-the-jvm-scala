package part1basics

object Functions extends App {

  //println("Whoop whoop")
  def aFunction(a: String,b: Int): String = {
    a + " " + b
  }

  //println(aFunction ("god", 20))

  // simple unit function / side effect
  def greeter(name: String, age: Int) = println(s"Hello, my name is ${name}, I am ${age} ")

  // factorial function 4 * 3 * 2 * 1
  def calcFact(n: Int): Int = {

    def loop(remaining: Int) : Int = {

      if (remaining == 1) 1
      else {
        remaining * loop(remaining-1)
      }
    }
    loop(n)
  }

  // Fibonacci sequence function f(n) = f(n -1) + f(n -2)
  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
  def calcFib(nth: Int) : Int = {

      def loop(first: Int, second: Int, times: Int): Int = {

       if (times == nth) {
           first + second
        }
        else {
          loop(second,first + second,times + 1)
        }

    }
    loop(0,1,0)
  }


  //Test if a number is prime: can be divided by itself and 1 only

  //greeter("David",12)
  //println(calcFact(7))

  println(calcFib(1))
  println(calcFib(2))
  println(calcFib(3))
  println(calcFib(4))
  println(calcFib(5))
  println(calcFib(6))
  println(calcFib(7))
  println(calcFib(8))
  println(calcFib(9))
  println(calcFib(10))

}