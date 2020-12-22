package exercises
// Linked list example
abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String // ploymorphic call
  override def toString: String = "[ " + printElements + " ]"

}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException // as does n't make sense
  def tail: MyList = throw new NoSuchElementException // as does n't make sense
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Contains(element,Empty)
  def printElements: String = "nowt mate"
}

class Contains(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Contains(element, this)
  def printElements: String = {
    if (t.isEmpty) h.toString
    else h.toString + " " + t.printElements
  }
}

// Now test our  implementation of a liked list

object TestList extends App{

  val list = new Contains( 10, new Contains(15, new Contains(20, Empty)))

  println(list.head)
  println(list.tail.head)
  println(list.add(5).printElements)
  println(list.add(5).toString)
  println(list.printElements)
  println(list.toString)
  println(Empty.printElements)
  println(Empty.toString)

}