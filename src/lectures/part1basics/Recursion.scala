package lectures.part1basics

import scala.annotation.tailrec

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

    println(anotherFactorial(8))

  // Exercises
  //1 Concatenate a string n times
  def strConcatenator(aString: String, times: Int, accumulator: String): String =

      if (times <=  0 ) accumulator
      else strConcatenator(aString, times -1, aString + " " + accumulator)

  println(strConcatenator("dog", 4,""))

  // 2 isPrime function tail recursion
  def isPrime(nosToCheck: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(x: Int, isStillPrime: Boolean): Boolean =

      if (!isStillPrime) false
      else if (x <= 1) true
      else isPrimeTailRec( x -1, nosToCheck % x != 0 && isStillPrime)  //don't fully understand this

    isPrimeTailRec(nosToCheck / 2, true )
  }

  println(isPrime(2003))
  println(isPrime(629))

  // 3 Fibonacci function, tail recursion
  def fibonacci (n: Int): BigInt = {
    @tailrec
    def fiboTailRec(x: BigInt, last: BigInt, nextToLast: BigInt): BigInt =
      if (x >= n) last
      else fiboTailRec(x + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2,1,1)
  }
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(7))
    println(fibonacci(62))
  }
