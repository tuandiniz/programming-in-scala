package com.tuandiniz

trait IncrementQueue extends IntQueue:
  abstract override def put(n: Int): Unit =
    super.put(n + 1)
