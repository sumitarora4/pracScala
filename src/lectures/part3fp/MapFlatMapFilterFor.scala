package lectures.part3fp

object MapFlatMapFilterFor extends App{

  val list = List(1,2,3)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 1))
  println(list.map(_ + "is a member"))

  //filter
  println(list.filter(_ % 2 ==0))

  //flatmap
  val toPair = (x: Int) => List(x,x + 1)
  println(list.flatMap(toPair))

  // Exercise: Print all combinations between two list
  val numbers = List(1,2,3,4)
  val chars = List('a','b','c','d')
  val colors = List("black","white")

  println(numbers.flatMap(n => chars.map(c => ""+c + n)))
  println(numbers.flatMap(n => chars.flatMap(c => colors.map(co => "" + c + n + "-"+ co))))


  // for each
  list.foreach(println)

  // Similar for comprehension for above exercise
    val forCombinations = for{
      n <- numbers if n % 2 ==0
      c <- chars
      co <- colors

    } yield "" + c + n + "-"+ co

    println(forCombinations)
}
