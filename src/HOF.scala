package com.knoldus.rockthejvm

import sun.nio.cs.ext.MacHebrew

object HOF extends App {
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  // curried function
  val superAdder: Int => Int => Int = (x: Int) => (y: Int) => x + y
  val add = superAdder(3)
  println(add(10))
  println(superAdder(3)(10))

  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.2f")
  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}