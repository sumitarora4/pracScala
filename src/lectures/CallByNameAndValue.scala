package lectures

object CallByNameAndValue extends App {

  def CallByValue(x: Long)={ // System.nanoTime() evaluated first and then passed to println statement
    println(x)
    println(x)
  }

  def CallByName(x: => Long) ={  // => operator passes System.nanoTime() as an expression not value and evaluated in println statement
    println(x)
    println(x)
  }

  CallByValue(System.nanoTime())
  CallByName(System.nanoTime())

  // second example

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())
  printFirst(infinite(), 34)
}
