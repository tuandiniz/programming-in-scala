import com.tuandiniz.Fruit.{Mango as _, Apple as Delicious, *}
import com.tuandiniz.Fruit

@main def hello(): Unit =
  val fruit = Banana

  import fruit.*
  println(name)
  println(color)

  println(Fruit.Apple)
  println(Banana)
  println(Delicious)
  println(Fruit.Mango)
