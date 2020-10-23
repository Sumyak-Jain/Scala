// set creation
import scala.collection.immutable._
object collections{
  def main(args:Array[String]){
    val technologies = Set("Devops","Cloud","Scala","DataScience") //created the Set
    println(technologies.head)             // Returns first element present in the set
    println(technologies.tail)         // Returns all elements except first element.
    println(technologies.isEmpty)          // Returns either true or false
  }
}
