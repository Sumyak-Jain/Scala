//Function Composition
object HigherOrderFunction {
  def main(args: Array[String]) = {
    var output = multiplyBy100(sub5(15))      // Function composition
    println("Final result: "+output)
  }
  def sub5(x:Int):Int = {
    x-5
  }

  def multiplyBy100(x:Int):Int = {
    x*100
  }
}
