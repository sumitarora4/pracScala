package lectures.par2OOP

object OOPBasics extends App{

  val writer = new Writer("sumit", "arora", 1984)
  val imposter = new Writer("sumit", "arora", 1984)
  val novel = new Novel("scalaBasics", 2019, writer)

  println(novel.authorAge)
  println(novel.isWrittenBy(writer))
  println(novel.isWrittenBy(imposter))
}


class Writer(firstName: String, surName: String, val year: Int){
  def fullName(firstName: String, surName: String): String ={
    firstName + surName
  }
}

class Novel(name: String, yearOfRelease: Int, author: Writer){

  def authorAge = {
    yearOfRelease - author.year
  }

  def isWrittenBy(author: Writer)= {
    author == this.author
  }

  def copy(newYear: Int): Novel = {
    new Novel(name, newYear, author)
  }


}