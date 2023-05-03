package com.knoldus.rockthejvm

import scala.collection.parallel.immutable.ParSeq
import scala.util.Random

object practicing extends App {
  val collection = new ParralelSequential
  val list1 = (1 to 1000).toList
  collection.sideEffect(list1)
  collection.display

  val list2 = ((1 to 1000).toList).par
  collection.sideEffectParallel(list2)
  collection.display

  private val result1 = collection.associativeParallel(list2)
  println("result:" + result1)

  val collections = new ParralelSequential
  val list = (1 to 1000).toList.par
  val result = collections.associativeParallel(list)
  println("result:" + result)
  Random.nextLong()
}

class ParralelSequential {
  private var sum: Int = 0

  def sideEffect(values: List[Int]): Unit = {
    values.foreach {
      sum += _
    }
  }

  def associative(values: List[Int]): Int = {
    values.reduce((first, second) => first - second)
  }

  def sideEffectParallel(values: ParSeq[Int]): Unit = {
    values.foreach(sum += _)
  }

  def associativeParallel(values: ParSeq[Int]): Unit = {
    values.foreach(sum += _)
  }

  def display(): Unit = {
    println("Sum:" + sum)
  }
}
