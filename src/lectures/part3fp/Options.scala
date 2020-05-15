package lectures.part3fp

object Options extends App{


  val myFirstOption: Option[Int] = Some(4)
  val noneOption: Option[Int] = None

  println(myFirstOption)


  // work with unsafe apis
  def unsafeMethod(): String = null
  val result = Option(unsafeMethod())

  println(result)

  def safeMethod(): String = "a valid result"

  val chainedResult = Option(unsafeMethod()).orElse(Option(safeMethod()))
  println(chainedResult)


}
