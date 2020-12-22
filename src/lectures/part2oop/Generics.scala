package lectures.part2oop

import lectures.part2oop.Generics.{Contains, Empty, MyListGen}

// Make a generic version of the MyList linked list from previous class
object Generics extends App {

  abstract class MyListGen[+A] { // make it covariant
  // uses the type of A
    def head: A
    def tail: MyListGen[A]
    def isEmpty: Boolean
    def add[B >: A](element: B): MyListGen[B] // B is a super type of A
    def printElements: String // ploymorphic call
    override def toString: String = "[ " + printElements + " ]"
  }

  object Empty extends MyListGen[Nothing] {
    def head: Nothing = throw new NoSuchElementException // as does n't make sense
    def tail: MyListGen[Nothing] = throw new NoSuchElementException // as does n't make sense
    def isEmpty: Boolean = true
    def add[B >: Nothing](element: B): MyListGen[B] = new Contains(element,Empty)
    def printElements: String = "nowt mate"
  }

  class Contains[+A] (h: A, t: MyListGen[A]) extends MyListGen[A] { // means this has to be covariant as well
    def head: A = h
    def tail: MyListGen[A] = t
    def isEmpty: Boolean = false
    def add[B>:A](element: B): MyListGen[B] = new Contains(element, this)
    def printElements: String = {
      if (t.isEmpty) h.toString
      else h.toString + " " + t.printElements
    }
  }
}

object TestGenericList extends App {

  val intList: MyListGen[Int] = new Contains(10,Empty)
  println(intList.head)
  println(intList.toString)
  println(intList.add(20).toString)

  val strList: MyListGen[String] = new Contains("Pencil", Empty)
  println(strList.head)
  println(strList.toString)
  println(strList.add("Rubber").toString)

}