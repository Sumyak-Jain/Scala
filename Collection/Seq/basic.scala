// Seq example
import scala.collection.immutable._
object seq{
  def main(args:Array[String]){
    var numbers:Seq[Int] = Seq(1,2,3,4,5)
println("Elements in Seq:")
    for(output <- numbers){
println(output)
    }
println("Is seq Empty: "+numbers.isEmpty)
println("Last index of 2 : "+numbers.lastIndexOf(2))
println("Contains 10: "+ numbers.contains(10))
println("Ends with (4,5): "+ numbers.endsWith(Seq(4,5)))
println("Reverse order of sequence: "+numbers.reverse)
  }
}
