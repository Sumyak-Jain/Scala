// create,read and write
import java.io._
import scala.io.Source
object filehandling {
  def main(args:Array[String]){
valfileObject = new File("Scala.txt" )     // Creating a file
valprintWriter = new PrintWriter(fileObject)  // Passing reference of file to the printwriter
printWriter.write("Welcome to Status Neo")  // Writing to the file
printWriter.close()
val filename = "Scala.txt"
valfileSource = Source.fromFile(filename)
    for(line<-fileSource.getLines){
println(line)
    }
fileSource.close()
  }
