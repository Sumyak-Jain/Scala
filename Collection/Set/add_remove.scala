//Adding and removing of element from set
import scala.collection.immutable._
object collections{
  def main(args:Array[String]){
    var technologies = Set("Devops","Cloud","Scala","DataScience") //created the Set
    println(technologies)

    technologies += "IOT"  //adding element
    println(technologies)

    technologies -= "DataScience" // removing element
    println(technologies)

    technologies += "IOT"  //duplicacy not allowed
    println(technologies)

  }
}
