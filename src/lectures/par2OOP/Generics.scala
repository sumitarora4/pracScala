package lectures.par2OOP

object Generics extends App{

  // defining non empty collection like list
  class MyList[A]{
    // use the type A
  }

  // non empty collection- another example like map
  class MyMap[key, value]{
  }

  // calling non empty collection
  val listOfInteger = new MyList[Int]
  val listOfString = new MyList[String]


  // generic methods - empty collection means object
  object MyList{
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]


  // variance problem
  class Animal
  class Cat extends Animal
  class Dob extends Animal

  // 1. is List[Cat] extends List[Animal]? yes: = COVARIANCE
  class CovarianceList[+A]
  val animal: Animal = new Cat
  val animalList: CovarianceList[Animal] = new CovarianceList[Cat]

  // 2. No = INVARIANCE
  class InvarianceList[A]
  val invarianceAnimalList: InvarianceList[Animal] = new InvarianceList[Animal]

  // 3. Hell, no! = CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]




}
