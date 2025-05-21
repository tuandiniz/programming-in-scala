import java.io.File

object FileMatcher:
  private def findFilesHere =
    new File(".").listFiles

  private def findFilesMatching(query: String, matcher: (String, String) => Boolean): Array[File] =
    findFilesHere.filter(file => matcher(file.getName, query))

  def findFilesStartingWith(query: String): Array[File] =
    findFilesMatching(query, _.startsWith(_))

  def findFilesContaining(query: String): Array[File] =
    findFilesMatching(query, _.contains(_))

  def findFilesMatching(query: String): Array[File] =
    findFilesMatching(query, _.matches(_))

@main def hello(): Unit =
  import FileMatcher.*
  var query = "t"
  var files = findFilesStartingWith(query)
  println(s"Starting with '$query': \n" + files.mkString("\n"))
  files = findFilesContaining(query)
  println(s"Containing '$query': \n" + files.mkString("\n"))

  query = raw"tar.*|\..*"
  files = findFilesMatching(query)
  println(s"Matching '$query': \n" + files.mkString("\n"))