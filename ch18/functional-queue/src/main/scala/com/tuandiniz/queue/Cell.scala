package com.tuandiniz.queue

class Cell[T](init: T):
  private var current = init

  def get: T = current
  def set(x: T): Unit = current = x

