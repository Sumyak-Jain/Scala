// for loop filtering
object loops {
  def main(args: Array[String]) {
    println("Table of 5:")
    for( x <- 1 to 50 if x%5==0){
      println(x)
    }
  }
}
