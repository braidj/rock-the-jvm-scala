package lectures.part1basics

object DefaultArgs extends App {

  def trTacf(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trTacf(n-1,n*acc)

  println( trTacf(5))

}
