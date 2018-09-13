package com.meldmy

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class XbonacciScalaTest extends FunSpec {

  val solution = new XbonacciScala()

  describe("Should create a tribonacci sequence") {

    it("should handle basic cases") {
      Array(0, 1, 1, 2, 4, 7, 13, 24, 44, 81) shouldBe solution.tribonacci(Array[Double](0, 1, 1), 10)
      Array(0, 0, 1, 1, 2, 4, 7, 13, 24, 44) shouldEqual solution.tribonacci(Array[Double](0, 0, 1), 10)
      Array(1, 1, 1, 3, 5, 9, 17, 31, 57, 105) should be(solution.tribonacci(Array[Double](1, 1, 1), 10))

    }

    it("should return empty array when n is zero -- different ways to test that :)") {
      val result = solution.tribonacci(Array[Double](1, 1, 1), 0)
      result shouldBe empty
      result should be(empty)
      result should have length 0
    }
  }
}
