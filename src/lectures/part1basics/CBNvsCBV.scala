package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("By value:" + x)
    println("By value:" + x)

  }

  def callByName(x: => Long): Unit = {
    println("By Name:" + x)
    println("By Name:" + x)

  }


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)


  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  //printFirst( infinite(),34) // Will crash
  printFirst( 34, infinite()) // returns 34, as the 2nd parameter is never evulated as it is not used
}
