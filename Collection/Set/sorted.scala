//sorted set
import scala.collection.immutable._
object collections{
  def main(args:Array[String]){
    var sortednumbers: SortedSet[Int] = SortedSet(1,4,3,5,7,6,8,9,0,2)
    println("Sorted set is:")
    for (output <- sortednumbers){  //for loop
      println(output)
    }

  }
}
