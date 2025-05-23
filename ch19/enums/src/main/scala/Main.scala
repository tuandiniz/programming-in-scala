import com.tuandiniz.Direction

@main def hello(): Unit =
  val dir = Direction.North

  println(s"Direction $dir and It's inverse ${dir.invert}")
  println(s"All directions: ${Direction.values.mkString(", ")}")