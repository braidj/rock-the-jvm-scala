package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  var aVariable = 3
  aVariable += 2
  println(aVariable)

  // Expression
  val aCondition: Boolean = false
  val aConditionedValue = if (aCondition) 3 else 7 // If Expression
  println(aConditionedValue)
  println(if (aCondition) 3 else 7)

  val aWeirdValue = (aVariable = 3) // type of unit
  println(aWeirdValue)

  //Code Blocks
  val aCodeBlock = {

    val x = 2
    val z = x + 2

    if (z > 2) "Hello" else "Goodbye"

  }

  println(aCodeBlock)

}
