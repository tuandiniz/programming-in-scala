package com.tuandiniz

import scala.annotation.targetName

class ChecksumAccumulator:
  private var sum: Int = 0

  @targetName("add")
  def += (num: Int): Unit =
    sum += num

  def checksum(): Int = ~(sum & 0xFF) + 1
