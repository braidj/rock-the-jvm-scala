package lectures.part2oop

object Objects extends App{
 //scala does not have class level functionality (static in java speak)

  object Person { // is type and its only instance
   // can have vals vars and methods, but can not take parameters
   val N_EYES = 2
   def canFly: Boolean = false

   // factory method
   //def from(mother: Person, father: Person): Person = new Person("Junior")
   // but often factory methods are called using apply
   def apply(mother: Person, father: Person): Person = new Person("Junior")

  }

  class Person (name: String) {
   // instance level functionality
  }

 // writing class and object in same scope, same name = COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

 //scala object is a singleton instance, by definition
 val mary = Person
 val john = Person

 println(mary == john) // true as there are the same instance of the object

 val person1 = new Person("julia")
 val person2 = new Person( "dick")

 println ( person1 == person2) // false as different instances of the class

  //val bobbie = Person.from(person1,person2) // original factory method
 val bobbie = Person.apply(person1,person2)
 val jonesy = Person(person1,person2) // equivalent

 // Scala Applications = Scala object with a signature of
 // def main(Args: Array[String]): Unit
 // extends App works as it already has a def main method

}
