// scala abstract class
abstract class animals{
  def sound()
}

class dog extends animals{
  def sound(){
    println("Dog Barks")
  }
}

object  abstractclass{
  def main(args: Array[String]){
    var h = new dog()
    h.sound()
  }
}
