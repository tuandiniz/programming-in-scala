package com.tuandiniz

import scala.compiletime.uninitialized

class Thermometer:
  var celsius: Float = uninitialized

  def fahrenheit: Float = celsius * 9 / 5 + 32

  def fahrenheit_=(f: Float): Unit =
    celsius = (f - 32) * 5 / 9

  override def toString = s"${fahrenheit}F/${celsius}C"
