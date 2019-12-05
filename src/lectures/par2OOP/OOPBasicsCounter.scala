package lectures.par2OOP

object OOPBasicsCounter extends App{

  val counter = new Counter(0)
  counter.increaseCounter
  counter.print

  counter.increaseCounter
  counter.increaseCounter
  counter.increaseCounter
  counter.print

  counter.increaseCounter
  counter.increaseCounter
  counter.increaseCounter
  counter.increaseCounter
  counter.increaseCounter
  counter.print

  val nCounter  = new NewCounter
  nCounter.inc.print
  nCounter.inc.inc.inc.print
  nCounter.inc(10).print


}

/**
  *
  * this is old imperative way to define the counter class and it's method
  */
class Counter(value:Int) {
  def currentCount():Int ={
    value
  }

  def increaseCounter: Int ={
    println("incrementing old way")
    value + 1
  }

  def decreaseCounter(): Int = {
    println("decrementing old way")
    value -1
  }

  // overload function

  def increaseCounter(n: Int): Counter ={
    new Counter(value + n)
  }

  def decreaseCounter(n: Int): Counter= {
    new Counter(value - n)
  }

  def print = println(currentCount)
}

/**
  * NewCounter class with functional programming way
  */

class NewCounter(val count: Int = 0){

  // no need to define currentCount() method
  // as count variable is already define as 'val'

  def inc = {
    println("incrementing")
    new NewCounter(count + 1) // every time instantiate 'NewCounter' class to change 'count' value
                              // so that immutability of 'count' variable would be maintained
  }

  def dec = {
    println("decrementing")
    new NewCounter(count -1 )
  }

  // overload function with tail recursion

  def inc(n: Int): NewCounter = {
    if (n<= 0 ) this
    else inc.inc(n -1)
  }

  def dec(n : Int): NewCounter = {
    if (n <= 0 ) this
    else dec.dec(n -1)
  }

  // print function
  def print = println(count)
}


