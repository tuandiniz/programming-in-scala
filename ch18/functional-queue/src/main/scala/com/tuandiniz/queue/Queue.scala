package com.tuandiniz.queue

trait Queue[+T]:
  def head: T
  def tail: Queue[T]
  def enqueue[W>:T](elem: W): Queue[W]

object Queue:
  def apply[T](initial: T*): Queue[T] = new QueueImpl(initial.toList.reverse, Nil)

  private class QueueImpl[T] (
          private val leading: List[T],
          private val trailing: List[T]
    ) extends Queue[T] :

    override def head: T =
      mirror.leading.head

    override def tail: Queue[T] =
      val mirrored = mirror
      if mirrored.leading.isEmpty then
        mirrored
      else
        new QueueImpl(mirrored.leading.tail, mirrored.trailing)

    override def enqueue[W>:T](elem: W): Queue[W] =
      new QueueImpl(leading, elem :: trailing)

    override def toString: String =
      val buf = new StringBuilder()
      buf.append("[")
      buf.append(leading.mkString(", "))
      buf.append(trailing.reverse.mkString(", "))
      buf.append("]")
      buf.toString

    private def mirror: QueueImpl[T] =
      if leading.isEmpty then
        new QueueImpl(trailing.reverse, Nil)
      else
        this