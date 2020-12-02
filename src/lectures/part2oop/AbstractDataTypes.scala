package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract (don't assign values to them they are not implemented and cannot be instantiated)
  abstract class Animal {

    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "canine"

    override def eat: Unit = println("crunch crunch")
  }

  // traits, how are they diff from  classes
  // 1 - cannot constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits are behaviour, abstract class is a type of thing
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "amphibian"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"Im a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

}
