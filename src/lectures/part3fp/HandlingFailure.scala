package lectures.part3fp

import java.sql.Connection
import java.util.Random

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App{

  val aSuccess = Success(3)
//  val aFailure = Failure(throw new RuntimeException("Supre Failure"))

  //println(aSuccess)
//  println(aFailure)

  def unsafeMethod: String = throw new RuntimeException("No String for you")

  val potentialFailure = Try(unsafeMethod)

  println(potentialFailure)
  println(potentialFailure.isSuccess)
  println(potentialFailure.isFailure)

  // how to use Try expression
  def backupMethod: String = "a Valid result"

  val fallbackTry = Try(unsafeMethod).orElse(Try(backupMethod))
  println(fallbackTry)

  // for designing API
  // if you know your method can give exception use with failure
  val betterUnsafeMethod: Try[String] = Try(throw new RuntimeException("no found sorry"))

  // For method which can give success result
  val betterBackupMethod : Try[String] = Try("a string found")

  // now use this way
  val betterFallBackTry = betterUnsafeMethod.orElse(betterBackupMethod)
  println(betterFallBackTry)

  // filter, map, flatMap
  println(aSuccess.map(_ * 2))
  println(aSuccess.flatMap(x => Success(x * 10)))
  println(aSuccess.filter(_ > 10))


  /* Exercise */

  val host = "localhost"
  val port = "8080"

  def renderHTML(page: String) = println(page)

  class Connection{
    def get(url: String): String={

      val random = new Random(System.nanoTime())
      if(random.nextBoolean()) "<html>...</html>"
      else throw new RuntimeException("connection interrupted")
    }

    def getSafe(url: String): Try[String] = Try(get(url))
  }

  object HTTPService{
    val random = new Random(System.nanoTime())
    def getConnection(hots: String, port: String): Connection = {
      if (random.nextBoolean()) new Connection
      else throw new RuntimeException("port is taken by other process")
    }

    def getSafeConnection(host: String, port: String): Try[Connection]  ={
      Try(getConnection(host, port))
    }

  }

  // if you get the html page from the connection, print it to the console

  val possibleConnection = HTTPService.getSafeConnection(host, port)
  val possbileHTML = possibleConnection.flatMap(con => con.getSafe("/index"))
  possbileHTML.foreach(renderHTML)

  // shorthand version
  HTTPService.getSafeConnection(host, port).flatMap(con => con.getSafe("/index")).foreach(renderHTML)

  // for-comprehension version
  for{
    conn <- HTTPService.getSafeConnection(host, port)
   html <- conn.getSafe("/index")
  }renderHTML(html)

}




