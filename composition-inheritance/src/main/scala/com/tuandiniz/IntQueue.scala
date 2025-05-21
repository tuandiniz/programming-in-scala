package com.tuandiniz

trait IntQueue:
  def put(n: Int): Unit
  def get(): Int
  def size: Int
