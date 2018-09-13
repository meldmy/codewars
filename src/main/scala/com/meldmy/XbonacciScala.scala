package com.meldmy

class XbonacciScala {

  def tribonacci(s: Array[Double], n: Int): Array[Double] = {
    val res = new Array[Double](n)
    for (i <- 0 until n) res(i) = if (i < 3) s(i) else res(i - 1) + res(i - 2) + res(i - 3)
    res
  }
}
