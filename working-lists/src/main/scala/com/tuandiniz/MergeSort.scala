package com.tuandiniz

object MergeSort:
  def sort[T](lessThan: (T, T) => Boolean)(toSort: List[T]): List[T] =
    val mergeSort = sort(lessThan)
    def merge(left: List[T], right: List[T]): List[T] =
      (left, right) match
        case (Nil, _) => right
        case (_, Nil) => left
        case (ls :: restLeft, rs :: restRight) =>
          if lessThan(ls, rs) then ls :: merge(restLeft, right)
          else rs :: merge(left, restRight)

    val n = toSort.length / 2
    if n == 0 then
      toSort
    else
      val (left, right) = toSort.splitAt(n)
      merge(mergeSort(left), mergeSort(right))