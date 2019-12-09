package lectures.par2OOP

object AbstractDataTypes extends App {


  abstract class Animal{

    val creatureType : String
    def eat: Unit
  }

  class Dog extends  Animal{

    val creatureType: String = "Canine"
    def eat : Unit = println("crunch crunch")
  }

    trait Carnivore {
      def eat(animal: Animal): Unit
      val preferredMeal: String = "fresh Meat"
    }

  class Crocodile extends Animal with Carnivore {

    override val creatureType: String = "croc"

    override def eat: Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"I am a croc and I'm eating ${animal.creatureType}")

  }
    val dog = new Dog
    val croc = new Crocodile

    croc.eat(dog)


  // trait Vs abstract class
//  1. trait do not have constructor parameter
//  2. multiple traits can be inherited by the same class while abstract class cannot
//  3. traits are behaviour , abstract class describes type


}
