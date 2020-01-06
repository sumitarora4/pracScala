package lectures.part3fp

object Sequences extends App {

  // sequences

  val aSequence = Seq(1.3, 4.4, 3.3, 4.2)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(6, 7, 8))
  println(aSequence.sorted)

  // Ranges
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(println)

  (1 to 10).foreach(x => println("Hello"))

  // List
  val aList = List(1, 2, 3, 4)
  val prepender = 45 +: aList :+ 56
  println(prepender)

  val apple5 = List.fill(5)("apple")
  println(apple5)

  println(aList.mkString("- | -"))

  // Array
  val aArray = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[String](3)
  threeElements.foreach(println)

  //mutation
  aArray(2) = 0
  //  println(aArray.foreach(x => x))
  aArray.foreach(println)
  println(aArray.mkString(" "))

  // arrays and seq
  val numbersSeq: Seq[Int] = aArray
  println(numbersSeq)
}