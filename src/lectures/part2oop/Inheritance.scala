package lectures.part2oop

object Inheritance extends App{

  // Single class inheritance
  class Animal {
    // access modifiers are none, private or protected
    // protected means can only access within the sub class
    val creatureType: String = "wild"
    protected def eat = println("yumm yumm yumm burp!")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("Crunch Crunch")
    }
  }

  val cat = new Cat
  //cat.eat
  cat.crunch

  // Cat is the sub class of the super class Animal, and only inherits non private members of the super class

  // constructors
  // will go to the constructor of the super class first, so signature has to match
  class Person(name: String, age: Int)  {
    def this(name: String ) = this(name,0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name) // can do this due to the this constructor in super class

  // overriding: works for methods as well as vars and vals
  class Dog extends Animal {
    override def eat = println("gone in two seconds")
    override val creatureType: String = "domestic"
    // you can also override vals in the constructor by passing into the class parameter
  }

  class AnotherDog (override val creatureType: String = "Robotic") extends Animal {}

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  val robotdog = new AnotherDog
  println(robotdog.creatureType)

  // a method call will always go to the most overridden version where possible
  // type substitution (broad polymorphism)
  val unknownAnimal: Animal  = new AnotherDog()

  // be clear on diff between overRIDING and overLOADING (diff signatures of  methods in the same class)

  // Super: used when you want to reference a method or field from a parent class
  // so even if the method / value is overriden you cans style refer to the implementation in parent calss
  // e.g super.eat

  // preventing overrides
  // 1. use final on member
  // 2. use final on entire class
  // 3. use seal the class = extends class in this FILE, but prevents extension in other files



}
