import com.tuandiniz.MergeSort

def append[T](left: List[T], right: List[T]): List[T] =
  left match
    case List() => right
    case x :: rest => x :: append(rest, right)

def rev[T](aList: List[T]): List[T] =
  aList match
    case List() => aList
    case x :: rest => rev(rest) ::: List(x)

@main def hello(): Unit =
  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3, 4)
  val diag3 = List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
  val empty: List[Nothing] = Nil

  println(fruit.mkString("; "))

  val moreFruit = "bananas" :: fruit
  println(moreFruit.mkString("; "))

  val numsAppending = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil
  println(numsAppending.mkString(" - "))

  val List(a, b, c, d, e, f) = numsAppending
  println(s"A: $a, B: $b and then C: $c")

  val allNums = append(nums, numsAppending)
  println(allNums)

  println(s"Length: ${allNums.length}; Init: ${allNums.init}; Last: ${allNums.last}")
  val reversed = rev(allNums)
  println(reversed)
  println(reversed.zipWithIndex)

  val zipped = numsAppending.map(_.toString).lazyZip(moreFruit)
  println(zipped)

  val flattened = zipped.flatMap((l, r) => List(l, r))
  println(flattened)

  // -------------------- Sorting lists
  val sortInts = MergeSort.sort((a: Int, b: Int) => a < b)
  val sortedAsc = sortInts(numsAppending)
  println(s"Ascending: $sortedAsc")

  val sortIntsDesc = MergeSort.sort((a: Int, b: Int) => b < a)
  val sortedDesc = sortIntsDesc((1 to 20).toList)
  println(s"Descending: $sortedDesc")

  val sortFruit = MergeSort.sort((f1: String, f2: String) => f1.length < f2.length)
  println(s"Fruit: ${sortFruit(fruit)}")


  // ------------ boolean checks -------
  val matrix = List(
    List(0, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )

  def hasZeroRow(matrix: List[List[Int]]): Boolean = matrix.exists(row => row.forall(_ == 0))

  println(s"Matrix has zero row: ${hasZeroRow(matrix)}")

  // ----------- Folding ---------------
  val allFruits = moreFruit.foldLeft("Delicious fruit:")(_ + ", " + _)
  println(allFruits)
  val foldedWrong = moreFruit.foldRight("Delicious fruit:")(_ + ", " + _)
  println(foldedWrong)

  def reverse[T](aList: List[T]): List[T] =
    aList.foldLeft(List())((a, b) => b :: a)

  val reverseStuff = reverse(moreFruit)
  println(s"Reversed fruit: $reverseStuff")

  val randomNumbers = List(-4, -5, 2, 6, 3, -7, 1)
  val sorted = randomNumbers.sortWith(_ < _)
  println(s"Sorted: $sorted")

  val fruitsSorted = moreFruit.sortWith((a, b) => (a.length < b.length) || a(0) < b(0))
  println(s"Sorted fruit: $fruitsSorted")


  // ------------ ranges ------------------
  val range = List.range(0, 21, 4)
  println(s"A crazy range: $range")

  val filled = List.fill(5)("a")
  println(s"Filled list: $filled")

  val tabulated = List.tabulate(3, 3)((a, b) => (1 + a) * (1 + b))
  println(tabulated.map(_.mkString(", ")).mkString("\n"))


