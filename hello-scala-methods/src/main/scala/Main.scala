case class Person(firstName: String, lastName: String):
  def fullName(): String = firstName + " " + lastName

def sum(a: Int, b: Int): Int = a + b
def concatenate(a: String, b: String = "?"): String = a + b
def double(n: Int) = n * 2

extension (p: Person) def formalName(): String =
  s"${p.lastName}, ${p.firstName}"

@main def hello(): Unit =
  println(s"Hello methods with the sum 2 + 3 = ${sum(2,3)}!")
  println(s"Then Hello + World = ${concatenate("Hello", "World")}!")
  println(s"Then Hello + ? = ${concatenate(a = "Hello")}!")

  val person = Person("Tuan", "Miranda")
  println(person)
  println(person.formalName())

  // First order functions
  val list = for i <- 0 to 10 yield i
  val doubles = list.map(_ * 2)
  println(doubles)
  val doublesWithFunction = list.map(n => sum(n, n))
  println(s"with function {$doubles}")

  val filteredDoubles = list.filter(_ > 3)
    .filter(_ <= 7)
    .map(double)

  println(s"with filters {$filteredDoubles}")

