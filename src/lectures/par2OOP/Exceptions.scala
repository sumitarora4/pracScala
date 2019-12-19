package lectures.par2OOP

object Exceptions extends App{

val x: String = null
//  println(x.length)

  //val aWiredValue : String = throw new NullPointerException

  // Exception and Errors are major throwable subtype

  //2. how to catch exceptions

  def goInt(withException: Boolean): Int ={
    if(withException) throw new RuntimeException("No int for your")
    else 43
  }

  val potentialFail = try{
    goInt(false)

  }catch {
//    case ex: RuntimeException => println("Catched the Runtime Error")
//    case exn : NullPointerException => println("Catched the NullPointer Exception")
    case ex : RuntimeException => 44
  }finally {

    // finally clause doesnot influence the return type of this expression
    // use finally only for side effects
    println("finally this will print for sure")

  }

  println(potentialFail)

}
