package com.tuandiniz

trait DoubleQueue extends IntQueue:
  abstract override def put(n: Int): Unit = super.put(n * 2)
