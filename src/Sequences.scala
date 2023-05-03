package com.knoldus.rockthejvm

import scala.util.Random

object Sequences extends App {

  //Seq
  val aSequence = Seq(1, 3, 2, 4)
  println(aSequence)
  println(aSequence.sorted)
  println(aSequence ++ Seq(7, 5, 6))
  println(aSequence.sorted)

  //Range
  val aRange: Seq[Int] = 1 to 5
  aRange.foreach(println)
  aRange.map(println)
  (1 to 5).foreach(x => println("Hello"))
  (1 to 5).map(x => println("Hii"))

  //List
  val list = List(1, 2, 3)
  val prepend = 42 +: list :+ 45 //prepend and append
  println(prepend)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(list.mkString("-|-"))


  //Arrays
  val numbers = Array(1, 2, 3, 4)
  val treeElements = Array.ofDim[String](3)
  println(treeElements)
  treeElements.foreach(println)

  //mutation
  numbers(2) = 0 //syntax sugar for numbers.update(2, 0)
  println(numbers.mkString(" "))

  val numbersSeq: Seq[Int] = numbers //= is implicit conversion
  println(numbersSeq)

  //vector
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)

  //vector v/s list
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random

  }


}
