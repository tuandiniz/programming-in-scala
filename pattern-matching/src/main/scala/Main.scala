def printMapContents(map: Object): Unit = {
  map match {
    case sMap: Map[_, _] => println(s"Map: ${sMap}")
    case List(a, b, c) => println(s"List: ${a}, ${b}, ${c}")
    case List(a*) => println(s"Big list: ${a.mkString(" ")}")
    case _ => println("Not found")
  }
}

val partial: PartialFunction[List[Int],Int] = {
  case a :: b :: _ =>
    println(s"Value found $b")
    b
}

@main def hello(): Unit =
  val aMap = Map("Banana" -> "Yellow", "Lemon" -> "Green", "Apple" -> "Red")
  val list = List(2, 3, 4)
  val anotherList = List(2, 3, 4, 5, 6)

  printMapContents(aMap)
  printMapContents(list)
  printMapContents(anotherList)

  if (partial.isDefinedAt(list)) {
    partial(list)
  }

  if (partial.isDefinedAt(List(1))) {
    partial(List(1))
  }

  val some = Some(3)

  val Some(value) = some
  println(s"Some value: $value")

  // -------------------------
  val capitals = Map("Japan" -> "Tokio", "France" -> "Paris", "Brazil" -> "Brasilia")

  for (country, capital) <- capitals do {
    println(s"Capital of $country is $capital")
  }

  val someFruits = List(Some("Banana"), None, Some("Apple"))
  val existingFruits = for case Some(fruit) <- someFruits yield fruit
  println(existingFruits.mkString(", "))

  println(aMap.map((a, b) => a + " - " + b).mkString("; "))

