package lectures

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
   
  
}