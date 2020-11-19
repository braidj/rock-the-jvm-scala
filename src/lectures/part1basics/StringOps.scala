package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala, mother fucker"


  // All from Java class
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.startsWith("Dog"))
  println(str.replace(" ","-"))
  println(str.length)

  //scala specific functions
    val aNumberString = "2"
    val aNumber = aNumberString.toInt  // easy casting

  println(str.reverse)
  println(str.take(3))

  // Scala specific string interpolators
  // S: $name or {$age + 1}
  // f: can set precision as well as having strings

}
