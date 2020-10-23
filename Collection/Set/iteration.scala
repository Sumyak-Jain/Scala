//Iterating set elements using loop
import scala.collection.immutable._
object collections{
  def main(args:Array[String]){
    var technologies = Set("Devops","Cloud","Scala","DataScience") //created the Set
    println("Output using for loop:")
    for( output <- technologies){ //using for loop
      println(output)
    }

    println("Output using foreach loop:")
    technologies.foreach((result:String)=> println(result)) //using foreach loop
  }
}
