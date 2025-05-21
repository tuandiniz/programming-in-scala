package com.tuandiniz

class Fruit(val name: String, val color: String):
  override def toString: String =
    s"Name: $name, Color: $color"

object Fruit:
  object Banana extends Fruit("Banana", "Yellow")
  object Apple extends Fruit("Apple", "Red")
  object Mango extends Fruit("Mango", "Pink")
