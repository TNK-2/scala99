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

  /**
   * P02
   */
  def findLastButOne[A](list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last

  /**
   * P02
   */
  def findLastButOneRecursive[A](list: List[A]): A = list match {
    case h :: _ :: Nil => h
    case _ :: tail => findLastButOneRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
