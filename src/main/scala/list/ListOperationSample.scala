package list

object ListOperationSample {

  /**
   * P01
   */
  def findLastElement[A](list: List[A]): A = list.last

  /**
   * P01
   */
  def findLastElementRecursive[A](list: List[A]): A = list match {
    case h :: Nil => h
    case _ :: tail => findLastElementRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
