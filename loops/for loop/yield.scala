// yield keyword
object loops {
  def main(args: Array[String]) {
    println("table of 5:")
    var output = for( x <- 5 to 50 if x%5==0) yield x
    for(y<-output){
      println(y)
    }
  }
}
