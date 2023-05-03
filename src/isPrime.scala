package com.knoldus.rockthejvm

import scala.annotation.tailrec

object isPrime extends App {
  private def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRecursion(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRecursion(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRecursion(n / 2, true)
  }

  println(isPrime(37))

}
