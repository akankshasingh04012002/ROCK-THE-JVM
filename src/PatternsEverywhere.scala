package com.knoldus.rockthejvm

object PatternsEverywhere extends App {
  //  try{
  //  }
  //  catch{
  //    case e: RuntimeException => "runtime"
  //    case npe: NullPointerException => "npe"
  //    case _ => "something else"
  //  }

  val list = List(1, 2, 3, 4)
  val evenOnes = for {
    x <- list if x % 2 == 0
  } yield 10 * x
  println(evenOnes)
  //generators are also based on PM
  private val tuples = List((1, 2), (3, 4))
  val filterTuples = for {
    (first, second) <- tuples
  } yield first * second
  println(filterTuples)
  //case classes ,:: operators,...

  private val tuple = (1, 2, 3)
  val (a, b, c) = tuple
  println(b)

  val head :: tail = list
  println(head)
  println(tail)

  //partial function based on PM
  private val mappedList = list.map {
    case v if v % 2 == 0 => v + "is even"
    case 1 => "the one"
    //case _ => " something else"
  }
  println(mappedList)

  val sum: PartialFunction[Int, String] = {
    case x if x > 0 => s"$x is a positive number"
  }
  println(sum(4))
}
