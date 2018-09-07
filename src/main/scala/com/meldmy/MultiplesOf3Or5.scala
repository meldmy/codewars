package com.meldmy

object MultiplesOf3Or5 {
  def solution(number: Int): Long = 2L to number - 1 filter (i => i % 3 == 0 || i % 5 == 0) sum
}