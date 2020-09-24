package lectures.part3fp

object PartiallyAppliedFunction extends App{

  //1- here price value is partially applied on function
  val discountedPrice = book(25, _)

  def book(discount: Double, price: Double): Double ={
    (1 - discount/100 ) * price
  }

  println(discountedPrice(100))

  //2- we can applied all function parameters later

  def mul (x: Int, y: Int): Int = {
    x * y
  }

  val r = mul _   // or mul(_,_)
  println(r(3, 5))


  //3- Use curried function with partially applied function
  // curried breaks function into no. of times of arguments available in function
  // like here here curried break div function into two function and you can pass
  // one value to each of the function

  def div(x: Int, y: Int): Int= {
    x / y
  }

  val result = (div _).curried

  println(result(10)(2))


}
