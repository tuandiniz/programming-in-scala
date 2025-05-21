package com.tuandiniz

import scala.collection.mutable.ListBuffer

class BasicIntQueue(vals: Int*) extends IntQueue:

  private val contents: ListBuffer[Int] = new ListBuffer()

  for v <- vals do
    v +=: contents

  override def put(n: Int): Unit = n +=: contents
  override def get(): Int =
    val v = contents.last
    contents.remove(contents.size - 1)
    v
  def size: Int = contents.size