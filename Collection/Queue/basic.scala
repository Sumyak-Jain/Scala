// basic queue
import scala.collection.immutable._
object queue{
  def main(args:Array[String]){
    var domain = Queue("Devops","cloud","DataScience")
print("Queue Elements: ")
domain.foreach((element:String)=>print(element+" "))
    var firstElement = domain.front
print("\nFirst element in the queue: "+ firstElement)
    var enqueueQueue = domain.enqueue("IOT")
print("\nElement added in the queue: ")
enqueueQueue.foreach((element:String)=>print(element+" "))
    var dequeueQueue = domain.dequeue
print("\nElement deleted from this queue: "+ dequeueQueue)
  }
}
