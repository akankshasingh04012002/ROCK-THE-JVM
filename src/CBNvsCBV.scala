package com.knoldus.rockthejvm

object CBNvsCBV extends App {
  def callaedByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("bt value: " + x)
    println("by value:" + x)
  }

  callaedByValue(System.nanoTime())
  calledByName(System.nanoTime())


}
