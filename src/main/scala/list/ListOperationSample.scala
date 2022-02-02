package list

import list.ListOperationSample.compress

import java.util.NoSuchElementException

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

  /**
   * P03
   */
  def findNth[A](n: Int, list: List[A]): A =
    if (n >= 0) list(n)
    else throw new NoSuchElementException

  /**
   * P03
   */
  def findNthRecursive[A](n: Int, list: List[A]): A =
    (n, list) match {
      case (0, h :: _) => h
      case (n, _ :: tail) => findNthRecursive(n -1, tail)
      case (_, Nil) => throw new NoSuchElementException
    }

  /**
   * P04
   */
  def length[A](list: List[A]): Int = list.length

  /**
   * P04
   */
  def lengthRecursive[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  /**
   * P05
   */
  def reverse[A](list: List[A]): List[A] = list.reverse

  /**
   * P05
   */
  def reverseRecursive[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  /**
   * P06
   */
  def isPalindrome[A](list: List[A]): Boolean = list.reverse == list

  /**
   * P07
   */
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  /**
   * P08
   */
  def compress[A](list: List[A]) = list.distinct

  /**
   * P08
   */
  def compressRecursive[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
  }

  /**
   * P09
   */
  def pack[A](list: List[A]): List[List[A]] = {
    if(list.isEmpty) List(List())
    else {
      val (packed, next) = list.span { _ == list.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  /**
   * p10
   */
  def encode[A](list: List[A]): List[(Int, A)] =
    pack(list).map { e => (e.length, e.head) }

  /**
   * P11
   */
  def encodeModified[A](list: List[A]): List[Either[A, (Int, A)]] =
    encode(list).map { t => if(t._1 == 1) Left(t._2) else Right(t) }
}
