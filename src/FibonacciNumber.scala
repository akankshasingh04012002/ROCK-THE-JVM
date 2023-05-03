package com.knoldus.rockthejvm

import scala.annotation.tailrec

object FibonacciNumber extends App {
  private def fibonacci(n: Int): Int = {
    @tailrec
    def loop(n: Int, prev: Int, curr: Int): Int = {
      if (n <= 0) prev
      else loop(n - 1, curr, prev + curr)
    }

    loop(n, 0, 1)
  }

  println("enter a number:")
  private val num = scala.io.StdIn.readInt()
  println(fibonacci(num))


}