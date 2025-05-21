trait Increaser:
  def increase(inc: Int): Int

def increaseOne(increaser: Increaser): Int =
  increaser.increase(1)

def speed(distance: Float, time: Float): Float =
  distance / time

@main def hello(): Unit =
  val distance = 20.0f
  val time = 3.0f
  println(s"If distance is $distance and time is $time then speed is ${speed(distance, time)}")
  println(s"Or also ${speed(time=time, distance=distance)}")
  println(s"Or even ${speed(20, 3)}")

  val p = Point(2.0)
  println(s"A point $p")
  val op = Point(y = 2.0)
  println(s"Another point $op")
  val finalP = Point(3.0, 4.0)
  println(s"Then point $finalP")
  val analyticPoint = new Point(-2.0, 3.0, 5.0)
  println(s"Analytical point $analyticPoint")

  val afterIncrease = increaseOne(_ + 7)
  println(s"After increase $afterIncrease")


case class Point(x: Double = 0.0, y: Double = 0.0):
  def this(y0: Double, slope: Double, x: Double) =
    this(x, x * slope + y0)