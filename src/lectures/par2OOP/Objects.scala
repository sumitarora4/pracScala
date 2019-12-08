package lectures.par2OOP

object Objects extends App{

  // scala does not know class level functionality "static"

  object Person{ // type + its a only instance
    // static class level functionality
    val N_EYES  = 2

    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String){
    // instance level functionality
  }

  // companions
  println(Person.N_EYES)
  println(Person.canFly)

  // scala objects = singleton instance

  // object level initialization
  val mary = Person
  val john = Person

  println(mary == john)


  // class level initialization
  val person1 = new Person("Person1")
  val person2 = new Person("Person2")

  println(person1 == person2)

  val bobbie = Person.apply(person1, person2)
}
