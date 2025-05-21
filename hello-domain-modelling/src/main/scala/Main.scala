trait Speaker:
  def speak(): String

trait TailWagger:
  def startTail(): Unit = println("Tail is wagging")
  def stopTail(): Unit = println("Tail is stoped")

trait Runner:
  def startRunning() : Unit = println("I'm running")
  def stopRunning() : Unit = println("Stopped running")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = s"$name: Woof!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak() = "Meow"
  override def startRunning(): Unit = println("Yeah... I don't run")
  override def stopRunning(): Unit = println("No need to stop")

case class Person(firstName: String, var lastName: String, vocation: String):
  def printFullName(): Unit = println(s"$firstName $lastName")

enum CrustSize:
  case Small, Medium, Large

import CrustSize.*

@main def hello(): Unit =
  val dog = Dog("Albert")
  dog.startTail()
  dog.stopTail()
  dog.startRunning()
  dog.stopRunning()
  println(dog.speak())

  val cat = Cat("Smeagol")
  cat.startRunning()
  cat.stopRunning()
  println(cat.speak())
  cat.startTail()

  val person = Person("Tuan", "Diniz", "Crazy person")
  person.printFullName()
  person.lastName = "Miranda"
  person.printFullName()
  println(person)

  val otherPerson = person.copy(vocation = "Neighborhood crazy man")
  println(otherPerson)

  val currentCrustSize = Large
  currentCrustSize match
    case Small => println("Small crust size")
    case Medium => println("Small crust size")
    case Large => println("Large crust size")
