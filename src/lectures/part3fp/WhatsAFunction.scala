package lectures.part3fp

object WhatsAFunction extends App{


  // calling trait as a function
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // function type = Function1[A, B]
  val stringToInteger = new Function1[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToInteger("3") + 4)

  // function type = Function2[A, B, R]
  val adder: ((Int, Int) => Int)= new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  println(adder(4,6))


 /*
  Exercise1: a function which takes 2 strings and concatnate them
   */

  val conCatenater: ((String,String) => String) = new Function2[String, String, String] {

    override def apply(v1: String, v2: String): String = v1.concat(v2)
  }

  println(conCatenater("Sum", "it"))


  /*
  Exercise2: Define a function which takes an int and returns another function which takes an int and returns an int
  then achieve add functionality
   */

  val superAdder :Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]]{

    override def apply(v1: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }
  }

  val adder3 = superAdder(3)
  println(adder3(40))

  // oR

  println(superAdder(3)(40))


}

trait MyFunction[A, B] {
  def apply(element :A): B
}


