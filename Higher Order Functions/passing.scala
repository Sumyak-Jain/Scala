//Passing a Function as Parameter in a Function
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    Statusneo("Status ", add)                   // Passing a function as parameter
  }
  def Statusneo(x:String, f:String=>String):Unit = {
    println(f(x))                                   // Calling that function
  }
  def add(x:String):String = {
    x+"Neo"
  }
}
