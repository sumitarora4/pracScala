package lectures.part3fp

object PartialFunctionCaseClass extends App {


  // 1- case pattern
  val p : PartialFunction[Int, Int]= {
    case x if (x % 2) == 0 => x *2
  }

  println(p(10))


  // 2- orElse function

  val p1 : PartialFunction[Int, Int] = {
    case x if (x % 5) == 0 => x * 5
  }

  val p2 : PartialFunction[Int, Int] ={
    case x if (x % 3) == 0 => x *3
  }

  val result = p1 orElse(p2)

  println(result(33))
  println(result(10))

  // 3- Collect method
  // this method collect the element from collection and apply partial function
  // store result in a new collection

  val p3 : PartialFunction[Int, Int] ={
    case x if(x % 7) == 0 => x * 7
   }

  val result2 = List(14, 27, 7)collect(p3)
  println(result2)

  // 4- andThen method
  // this append the chain of method to end of partial function

  val p4 = (x: Int) => x * 10

  val result3 = p3 andThen(p4)
  println(result3(14))
}
