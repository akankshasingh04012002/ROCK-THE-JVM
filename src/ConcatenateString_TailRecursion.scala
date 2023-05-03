package com.knoldus.rockthejvm

object ConcatenateString_TailRecursion extends App {
  def concatenateString(string: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateString(string, n - 1, string + accumulator)

  println(concatenateString("Hello", 5, "Hii"))


}
