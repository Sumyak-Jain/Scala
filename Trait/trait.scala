//basic trait example
trait class1{
  def print()
}

class class2 extends class1{
  def print(){
    println("Status Neo")
  }
}

object Trait{
  def main(args:Array[String]){
    val x = new class2()
    x.print()
  }
}
