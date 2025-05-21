package com.tuandiniz

trait FilterQueue extends IntQueue:
  abstract override def put(n: Int): Unit =
    if(n >= 0) super.put(n)
