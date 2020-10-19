//Function Currying
object HigherOrderFunction {
  def sum(x:Int)(y:Int):Int = {
    x+y
  }
  def main(args: Array[String]):Unit = {
    //normal function
    var output = sum(2)(3)
    println("sum of the numbers are: "+output)

    // function currying
    var add = sum(5)_  //Here, only the ‘_’ is added after the calling the function add for value of sum

    var output1 = add(2)
    println("sum of the numbers are: "+output1)
  }
}
