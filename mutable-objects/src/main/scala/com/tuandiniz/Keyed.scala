package com.tuandiniz

import scala.util.Random

sealed class Keyed:
  def computeKey: Int = Random.nextInt()
  
class MemoKeyed extends Keyed:
  private var cache: Option[Int] = None

  override def computeKey: Int =
    if cache.isEmpty then
      cache = Some(super.computeKey)
    
    cache.get