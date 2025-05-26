import com.tuandiniz.Direction

@main def hello(): Unit =
  val dir = Direction.North

  println(s"Direction $dir and It's inverse ${dir.invert}")
  println(s"All directions: ${Direction.values.mkString(", ")}")
  println(s"Ordinals: ${Direction.values.map(v => v.ordinal).mkString(" ,")}")
  println(s"Nearest to 67: ${Direction.nearestTo(67)}")
  println(s"Nearest to 172: ${Direction.nearestTo(172)}")
  println(s"All but nearest to 280: ${allButNearest(280)}")

def allButNearest(degrees: Int): List[Direction] = {
  val nearest = Direction.nearestTo(degrees)
  Direction.values.filter(v => v != nearest).toList
}