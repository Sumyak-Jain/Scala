//Scala String equals() Method 
class equal{
  var s1 = "welcome to status neo"
  var s2 = "status neo"
  var s3 = "status neo"
  def print(){
    println(s2.equals(s3))
    println(s1.equals(s2))
  }
}

object string{
  def main(args:Array[String]){
    var a = new equal()
    a.print()
  }
}
