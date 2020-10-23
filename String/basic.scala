//string with a basic example
class basic{
  var x = "Status Neo, Welcomes you"
  def print(){
    println(x)
  }
}

object string{
  def main(args:Array[String]){
    var a = new basic()
    a.print()
  }
}
