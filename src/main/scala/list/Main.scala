package list

object Main {

  def main (args: Array[String]): Unit = {

    val lastElement = ListOperationSample
      .findLastElement(List(2, 3, 5, 1))
    val lastElementRecursive = ListOperationSample
      .findLastElementRecursive(List(2, 3, 5, 1))
    println("P01 :: The last Element is : " + lastElement)
    println("PO1 :: The last Element Recursive is : " + lastElementRecursive)


    val lastButOne = ListOperationSample
      .findLastButOne(List(2, 3, 5, 1))
    val lastButOneRecursive = ListOperationSample
      .findLastButOneRecursive(List(2, 3, 5, 1))
    println("p02 :: The last but one is : " + lastButOne)
    println("p02 :: The last but one recursice is : " + lastButOneRecursive)


    val nth = ListOperationSample
      .findNth(3, List(2, 3, 5, 1))
    val nthRecursive = ListOperationSample
      .findNthRecursive(3, List(2, 3, 5, 1))
    println("P03 :: the nth elem is : " + nth)
    println("P03 :: the nth elem recursive is : " + nthRecursive)

    val len = ListOperationSample
      .length(List(2, 3, 5, 1))
    val lenRec = ListOperationSample
      .lengthRecursive(List(2, 3, 5, 1))
    println("P04 :: the len is : " + len)
    println("P04 :: the len recursive is : " + lenRec)

    val reverse = ListOperationSample
      .reverse(List(2, 3, 5, 1))
    val reverseRec = ListOperationSample
      .reverseRecursive(List(2, 3, 5, 1))
    println("P05 :: the len is : " + reverse)
    println("P05 :: the len recursive is : " + reverseRec)

    val isPalindrome = ListOperationSample
      .isPalindrome(List(2, 3, 3, 2))
    val isPalindrome2 = ListOperationSample
      .isPalindrome(List(2, 3, 3, 0))
    println("P06 :: the palindrome is : " + isPalindrome)
    println("P06 :: the palindrome2 is : " + isPalindrome2)

    val nestedList = List(1, 3, 6, List(3, 1, List(0, 77)), 5, List(9, 9))
    val flattenList = ListOperationSample.flatten(nestedList)
    println("P07 :: the flatten list is : " + flattenList)
  }
}
