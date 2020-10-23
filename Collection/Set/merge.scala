//merge set
import scala.collection.immutable._
object collections{
  def main(args:Array[String]){
    val technologies = Set("Devops","Cloud","Scala","DataScience") //created the Set
    val Names = Set("Sumyak","Kushagra")
    val mergeset = (Names ++ technologies) //merge set
    println("Number of elements in technologies set: " +technologies.size)
    println("Number of elements in names set: " +Names.size)

    println(mergeset)
    println("Number of elements in mergeset: " +mergeset.size)

  }
}
