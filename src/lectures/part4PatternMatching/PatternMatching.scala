package lectures.part4PatternMatching

import scala.util.Random

object PatternMatching {

  def main(args: Array[String]): Unit = {

    val random = new Random
    val x = random.nextInt(10)

    val description = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "something else"

    }

    println(description)

//  1. Decompose Values

    case class Person(name: String, age: Int)
    val bob = new Person("Sumit", 14)

    val greetings = bob match{

      case Person(a, b) if (b < 20 ) => s"My name is $a and I cant drink"
      case Person(a, b) => s"My name is $a and age is $b"
      case _ => "I don't know who I am"
    }

    println(greetings)


    /* Notes
    * 1. cases are matched in order
    * 2. If no case matched it gives MatchError
    * 3. Type of PatternMatching Expression is unified of all the types in all the cases
    * 4. 
    * */



  }
}
