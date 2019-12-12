package exercise

/**
  * head = first element of the list
  * tail = remainder of the list
  * isEmpty = is the list empty
  * add(int) = new list with this element added
  * toString = a string representation of the list
  */
abstract class MyList[+A] {

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyList[B]
  def printElement: String
  override def toString: String = "[" + printElement + "]"

}
// to make your own list collection
// List would have one empty collection and one non empty collection
// empty collection would be an object while non empty would be class

// empty collection
object Empty extends MyList[Nothing]{
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B):MyList[B] = new Cons(element, Empty)
  def printElement: String =""
}

// non empty collection
class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
  def add[B >:A](element: B):MyList[B] = new Cons(element, this)
  def printElement: String = {
    if(t.isEmpty) ""+h
    else h + " " + t.printElement
  }
}

// main method to call List
object ListTest extends App{
  /*val lst = new Cons(1, Empty)
  println(lst.head)

  val lst2 = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(lst2.tail.head)

  println(lst2.add(4).head)

  println(lst2.isEmpty)

  println(lst2.toString)*/

  val listofInterger: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listofStrings: MyList[String]  = new Cons("Hello", new Cons("Scala",Empty))

  println(listofInterger)
  println(listofStrings)



}