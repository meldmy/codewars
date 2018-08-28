package com.meldmy

/**
  * @author Dmytro Melnychuk
  */
class FindOdd {
  def findIt(a: Array[Int]): Int = a
    .groupBy(i => i)
    .filter(i => i._2.length % 2 != 0)
    .keys
    .last
}
