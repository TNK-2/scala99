package list

object Main {

  def main (args: Array[String]): Unit = {

    val lastElement = ListOperationSample
      .findLastElement(List(2, 3, 5, 1))
    val lastElementRecursive = ListOperationSample
      .findLastElementRecursive(List(2, 3, 5, 1))

    println("P01 :: The last Element is : " + lastElement)
    println("PO1 :: The last Element Recursive is : " + lastElementRecursive)
  }
}
