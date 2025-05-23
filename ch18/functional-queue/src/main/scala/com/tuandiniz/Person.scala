package com.tuandiniz

class Person(var firstName: String, val lastName: String) extends Ordered[Person]:
  override def compare(that: Person): Int =
    val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)

    if lastNameComparison != 0 then
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)

  override def toString: String = s"$firstName $lastName"

object Person:
  def main(args: Array[String]): Unit =
    val robert = Person("Robert", "Jones")
    val sally = Person("Sally", "Smith")

    println(robert > sally)

    val people = List(
      Person("Larry", "Wall"),
      Person("Anders", "Hejlsberg"),
      Person("Guido", "van Rossum"),
      Person("Alan", "Kay"),
      Person("Yukihiro", "Matsumoto")
    )

    println(people.sorted)