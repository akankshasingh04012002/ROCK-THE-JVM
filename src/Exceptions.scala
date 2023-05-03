package com.knoldus.rockthejvm

object Exceptions extends App {

  val x: String = null
  val aWeirdValue: String = throw new RuntimeException()


  def getINt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("no int for you")
    else 42

  val potentialFail = try {
    getINt(true)
  }
  catch {
    case e: RuntimeException => 43
  }
  finally {
    println("finally")
  }
}