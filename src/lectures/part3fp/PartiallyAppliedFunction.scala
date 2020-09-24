package lectures.part3fp

object PartiallyAppliedFunction extends App{

  def book(discount: Double, price: Double): Double ={
    (1 - discount/100 ) * price
  }



}
