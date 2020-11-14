package part1basics

object Functions extends App {

  // simple unit function / side effect
  def greeter(name: String, age: Int) = "Hello, my name is " + name +" , I am " + age + "years old"
  println(greeter("Jace",52))

  // factorial function 4 * 3 * 2 * 1
  def calcFact(n: Int): Int = {
    if (n <= 1) 1
    else
      n * calcFact(n -1)
  }
  println(calcFact(5))
  println(calcFact(6))
  println(calcFact(7))

  // Fibonacci sequence function f(n) = f(n -1) + f(n -2)
  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
  def calcFib(nth: Int) : Int = {
    if (nth <= 2) 1
    else
      calcFib(nth-1) + calcFib(nth-2)
  }

  //Test if a number is prime: can only be divided by itself and 1 only
  def CheckIfPrime(nosToCheck: Int): Boolean = {

    def primeUntil(t: Int): Boolean =

      if (t <= 1) true
      else nosToCheck % t != 0 && primeUntil(t - 1) //don't fully understand this

    primeUntil(nosToCheck / 2)
  }

  println(CheckIfPrime(2))
  println(CheckIfPrime(3))
  println(CheckIfPrime(47*2))

}