package lectures.part3fp

object AnonymousFunctions  extends App{

  // OOPs way to define a anonymous function
  var doubler = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }


  // Functional way to define a anonymous function
  // syntactic sugar of LAMBDA
  val doubler2 = (x: Int) => x * 2

  // OR
  val doubler3: Int => Int = x => x * 2

  // multiple parameters in a Lambda  (syntactic sugar)
  val adder = (x: Int, y: Int) => x + y

  //OR
  val adder1: (Int, Int)=> Int = (x,y) => x + y

  // no parameters (syntactic sugar)
  val justDoSomeThing = () => 3

  //oR
  val jusDoSomeThing2: () => Int = () => 3

  println(jusDoSomeThing2) // this will give function itself not call
  println(jusDoSomeThing2()) // calling of the function


  // curly braces with lambdas
  val strToInt = { (str: String) =>
    str.toInt

  }

  // MOAR syntactic sugar
  val niceIncrementor : (Int) => Int = _ + 1 // equivalent to x => x +1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (x,b) => x + b

  // /*
  //  Exercise2: Define a function which takes an int and returns another function which takes an int and returns an int
  //  then achieve add operation
  // (with lambda) functional way
  //   */

  val superAdder =  (x: Int) => (y: Int) => x  + y
  println(superAdder(2)(4))

}
