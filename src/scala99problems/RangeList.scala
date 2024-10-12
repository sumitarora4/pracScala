package scala99problems

import scala.::
import scala.annotation.tailrec

object RangeList extends App{


  //  build in function
  val rangeList = List.range(1,100)
//  println(rangeList)

  // Recursive
//  @tailrec
  def rangeRecursive(start: Int, end: Int)  : List[Int]= {
    if(end < start) Nil
    else start :: rangeRecursive(start + 1, end)
  }

//  println(rangeRecursive(1,100000)) // this will give stack over flow exception as this is not tail recursion

//  to overcome this stack over flow exception we should use tail recursion
//   If the recursive call is the last call in the function, the Scala compiler will optimize this into a loop in
  //   bytecode. That way, you won't get StackOverflowErrors. Also, if you add the @tailrec annotation to your
  //   recursive function, the compiler will warn you if your function is not tail call recursive.

  def rangeTailRecursion(start: Int, end: Int) = {
    @tailrec
    def rangeTR( result: List[Int], end: Int): List[Int] = {
      if (end < start) result
      else rangeTR(end:: result, end -1)
    }

    rangeTR(Nil, end)
  }

  println(rangeTailRecursion(1,10000000))

}
