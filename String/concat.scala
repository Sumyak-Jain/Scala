//Scala String concat() Method 
class concat{
  var s1 = "welcome to"
  var s2 = " status neo"
  var s3= s1+s2    //using + operator
  def print(){
    println("Using Inbuilt Method: " +s1.concat(s2))  //using inbuilt method
    println("Using + Operator: "+ s3)
  }
}

object string{
  def main(args:Array[String]){
    var a = new equal()
    a.print()
  }
}
