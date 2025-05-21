import com.tuandiniz.{BasicIntQueue, DoubleQueue, IncrementQueue, FilterQueue}

@main def hello(): Unit =
  val queue = BasicIntQueue()
  queue.put(1)
  queue.put(2)
  queue.put(3)
  for (elem <- (1 to 3)) {
    println(queue.get())
  }

  println("---------------------")

  val anotherQueue = new BasicIntQueue(7, 8, 9) with DoubleQueue with FilterQueue with IncrementQueue
  anotherQueue.put(1)
  anotherQueue.put(2)
  anotherQueue.put(3)
  anotherQueue.put(-3)
  anotherQueue.put(-1)
  for (elem <- (1 to anotherQueue.size)) {
    println(anotherQueue.get())
  }
