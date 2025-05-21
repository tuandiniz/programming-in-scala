package com.tuandiniz

class Time:
  private var h: Int = 12
  private var m: Int = 0

  def minute: Int = m
  def hour: Int = h

  def minute_=(v: Int): Unit =
    require(v < 60 && v >= 0, "Minute value should be between 0 and 59")
    m = v

  def hour_=(v: Int): Unit =
    require(v < 12 && v >= 0, "Hour value should be between 1 and 12")
    h = v

  override def toString: String = s"[$h: $m]"