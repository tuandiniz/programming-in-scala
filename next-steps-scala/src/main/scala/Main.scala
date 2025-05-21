import scala.collection.mutable

@main def hello(): Unit =
  // Use tuples
  var pair = (99, "Luftballons")
  println(pair)
  var (num, name) = pair
  println(s"Name: $name and value: $num")
  println(pair.getClass)

  // Use sets and maps
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Embraer"
  val query = jetSet.contains("Cessna")
  println(query)

  val movieSet = mutable.Set("Spotlight", "Moonlight")
  movieSet += "Paradise"

  println(s"${jetSet.getClass} ${movieSet.getClass}")
  println(jetSet)
  println(movieSet)

  // Maps
  val treasureMap = mutable.Map.empty[Int, String]
  treasureMap += 1 -> "Go to island"
  treasureMap += ((2, "Find big X on ground"), (3, "Dig"))
  val step2 = treasureMap(2)

  println(step2)

  // map() and for-yield
  println(jetSet.map(_ + " is great").mkString(", "))
  val newSet = for jet <- jetSet yield
    jet + " is cool"

  println(newSet)

  // Getting the indexes back
  val instructions = (1 to 3).map(treasureMap(_) + "!").mkString(", ")
  println(instructions)

  // Options
  val found = movieSet.find(_.startsWith("Spot")).map(_.toUpperCase)
  found.foreach(println)