package part1basics

object Recursion extends App{

    def factorial(n: Int): Int = {
      if (n <= 1) 1
      else n * factorial(n -1)
    }

    println(factorial(5))

  def anotherFactorial(n: Int): BigInt = {

    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n,1)
  }

    println(anotherFactorial(100))
}
