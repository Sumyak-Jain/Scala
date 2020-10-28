// basic list program
import scala.collection.immutable._
object list{
  def main(args:Array[String]){
    var domain = List("Devops","cloud","DataScience")
    var domain1 = List("IOT")
print("List Elements: ")
domain.foreach((element:String) =>print(element+"  "))

    var newList = domain :+ "ML"   // Adding a new element into list
println("\nList Elements after adding: ")
newList.foreach((element:String) =>print(element+"  "))

    var mergeTwoList = newList ++ domain1    // Merging two list
println("\nList Elements after merging: ")
mergeTwoList.foreach((element:String) =>print(element+"  "))

    var reverse = mergeTwoList.reverse   // Reversing list elements
println("\nList Elements after reversing: ")
reverse.foreach((element:String) =>print(element+"  "))

    var sortedList = mergeTwoList.sorted  // Sorting list elements
println("\nVector Elements after sorting: ")
sortedList.foreach((element:String) =>print(element+"  "))
  }
}
