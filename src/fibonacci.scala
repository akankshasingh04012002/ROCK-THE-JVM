package com.knoldus.rockthejvm

object fibonacci extends App {
  def fibonacci(n: Int): Int = {
    def fiboTailRecursion(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRecursion(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRecursion(2, 1, 1)
  }

  println(fibonacci(8))

}
