import scala.collection.mutable

case class Person(name: String, age: Int)

@main def hello(): Unit =
  val aSet = Set("Some", "Things", "Here")
  var anotherSet = aSet + "Other"

  println(anotherSet)

  anotherSet += "Another"
  println(anotherSet)

  var aMap = Map("One" -> 1, "Two" -> 2, "Three" -> 3)
  aMap += "Ten" -> 10
  println(aMap)

  val sorted = mutable.SortedSet(3, 4, -2, -6, 2, 1)
  println(sorted)

  implicit val ordering:Ordering[Person] = Ordering[(String, Int)].on[Person](x => (x.name, x.age))
  val sortedPeople = mutable.SortedSet(Person("Tuan", 23), Person("Chico", 45), Person("Chico", 22), Person("Amelia", 20))

  println(sortedPeople)

  val aMutMap = aMap to mutable.Map
  println(aMutMap)

  val aSortedMap = aMutMap to mutable.SortedMap
  println(aSortedMap)