import com.tuandiniz.model.{Apricot, Fruit, Plum, Pluot}

@main def hello(): Unit =
  val weird: Apricot | Plum = new Apricot {}
  val fruit: Fruit = weird
//  val other: Apricot | Plum = new Fruit {}
  val pluot = new Pluot {}
  val parent: Apricot | Plum = pluot
//  val anotherPluot: Pluot = parent

  println(errorMessage(-342))
  println(errorMessage("This is an error"))

def errorMessage(msg: Int | String): String =
  msg match
    case n: Int => s"Error number: ${n.abs}"
    case s: String => s + "!"