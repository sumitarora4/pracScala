package lectures.part3fp

object PartialFunction extends App{

  val r :PartialFunction[Int, Int] = new PartialFunction[Int, Int] {

    override def isDefinedAt(x: Int): Boolean = x != 0
//    override def isDefinedAt(x: String): Boolean = !x.isEmpty

        override def apply(x: Int): Int = 12 * x
//    override def apply(x: String): Int = x.toInt

  }

  println(r(10))

}
