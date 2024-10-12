package lectures

import scala.annotation.tailrec

object Functions extends App {
  
  
  // Repeat a string n times without using loops
  // When you need loops, use Recursion
  // here we are writing recursive function
  // always write return type of recursive function other wise
  // it will show "recursive method aRepeatedFunction needs result type" error
  
  def aRepeatedFunction(aString: String, n: Int): String ={
   if( n ==1) aString
   else aString + aRepeatedFunction(aString, n-1)  
  }
   
   println(aRepeatedFunction("hello", 3))


  /**
    * Exercise:
    *
    * A greeting function(name,age) => Hi my name is $name, age is
    * factorial
    * fibonacci series sum
    * check prime number
    *
    */

  def greetingFunction(name: String,age: Int) : Unit= {

    println(s"HI my name is $name and age is $age")

  }

  greetingFunction("sumit", 34)

  def factorialFunction(number: Int): Int = {

    if(number ==1) number
    else number * factorialFunction(number -1 )
  }

  println("factorial is: "+factorialFunction(3))

  def fibonacciFunction(number: Int): Int= {
    if (number ==1 || number == 2) number
    else fibonacciFunction(number -1 ) + fibonacciFunction(number -2)
  }

  println(fibonacciFunction(1))



  def primeFunction(n: Int): Boolean = {

    def isPrimeUntil(t: Int): Boolean = {

      if (t<= 1) true
      else n % t !=0 && isPrimeUntil(t -1)


    }
    isPrimeUntil(n / 2)
  }

  println(primeFunction(37))
  println(primeFunction(2003))
  println(primeFunction(56 *34))

  /**
    * Exercise
    * concatnate a string n times with tail recursion
    * isPrime function tail recursion
    * fibonacci function with tail recursion
    */


  @tailrec
  def concatnateTailRec(aSting: String, n : Int, accumulator: String): String={

    if(n <= 0) accumulator
    else concatnateTailRec(aSting, n -1, aSting + accumulator)
  }
  println(concatnateTailRec("hello",3, "new"))


  val str = "Sumit Kuamr Arora"
  var strCharAry = str.toList
  println(strCharAry)

  val charAryStr = strCharAry.mkString
  println(charAryStr)

  val filledArray = Array.fill(' ')(strCharAry)
  println("filledArray = "+filledArray)

//  val mkString = filledArray.mkString
//  println("mkString = "+mkString)

//  strCharAry.

//  var dd = str.replaceAll("^[a-zA-Z0-9_]","")
  println("removeAll="+strCharAry.mkString)


  val token = "234k234k234k"
  val hashValue = token.hashCode
  println(hashValue)




}