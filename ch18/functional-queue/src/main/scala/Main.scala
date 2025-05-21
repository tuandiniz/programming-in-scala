import com.tuandiniz.queue.Queue
import scala.Predef

@main def hello(): Unit =
  var strQueue = Queue[String]()
  strQueue = strQueue.enqueue("This")
  strQueue = strQueue.enqueue("is")
  strQueue = strQueue.enqueue("hello")
  strQueue = strQueue.enqueue("World")
  val crazyQueue = strQueue.enqueue(1)
  var anyQueue = crazyQueue.enqueue(Seq(23.2, 3.4, -234.234))

  println(anyQueue)
  println({ anyQueue = anyQueue.tail; anyQueue })
  println({ anyQueue = anyQueue.tail; anyQueue })
  println({ anyQueue = anyQueue.tail; anyQueue })
  println({ anyQueue = anyQueue.tail; anyQueue })
  println({ anyQueue = anyQueue.tail; anyQueue })

  val map = Map("x" -> 1, "y" -> 2)
  println(map)
