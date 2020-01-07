package lectures.part3fp

object TupleAndMaps extends App{

  // tuple is a finite order "list"
  val aTuple1 = new Tuple2(2,"hello Scala") //Tuple2[Int, String] = (Int, String)

  val aTuple = (2,"hi scala")
  println(aTuple._1)
  println(aTuple.copy(_2 = "good bye java"))
  println(aTuple.swap)

  // Map - Keys -> Values
  val aMap: Map[String, Int] = Map()

  val phoneBook = Map(("Jim", 555), "Sumit" -> 1525, "SS" -> 8888).withDefaultValue(-1)
  // here a -> b is sugar for (a,b)

  println(phoneBook)

  // map operation
  println(phoneBook.contains("Jim"))
  println(phoneBook("Sumit1"))

  // add a pairing
  val newPairing = "Arora" -> 7894
  println(phoneBook + newPairing)


  // functionals on Map
  // map, filter , flapMap

  println(phoneBook.map(b => b._1.toLowerCase -> b._2))

  // filterKeys

  println(phoneBook.filterKeys(b => b.startsWith("J")))

  // MapValues
  println(phoneBook.mapValues(n => "345-" + n))

  // groupBy
  val list = List("Sumit", "Kumar", "Arora", "Amit", "KK")
  println(list.groupBy(name => name.charAt(0)))

  println(phoneBook.groupBy(name => name._1.charAt(0)))

}
