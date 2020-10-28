// basic vector 
import scala.collection.immutable._
object vector{
def main(args:Array[String]){
    var domain = Vector("Devops","cloud","DataScience")
    var domain1 = Vector("IOT")
println("Vector Elements: ")

domain.foreach((element:String) =>println(element+" "))
    var newVector  = domain :+ "ML"  // Adding a new element into vector
println("Vector Elements after adding: ")
newVector.foreach((element:String) =>println(element+" "))

    var mergeTwoVector = newVector ++ domain1   // Merging two vector
println("Vector Elements after merging: ")
mergeTwoVector.foreach((element:String) =>println(element+" "))

    var reverse = mergeTwoVector.reverse   // Reversing vector elements
println("Vector Elements after reversing: ")
reverse.foreach((element:String) =>println(element+" "))

    var sortedVector = mergeTwoVector.sorted  // Sorting vector elements
println("Vector Elements after sorting: ")
sortedVector.foreach((element:String) =>println(element+" "))
  }
}
