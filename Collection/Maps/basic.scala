//basic maps
object map{
  def main(args:Array[String]){
    var map1 = Map(("D","Devops"),("S","StatusNeo"))  //comma seprated
    var map2 = Map("D"->"Devops","S"->"StatusNeo")  //rocket operator
println(map1)
println(map2)
    var newMap = map1+("C"->"Cloud")                // Adding a new element to map
println(newMap)
    var removeElement = newMap - "D"                // Removing an element from map
println(removeElement)

  }
}
