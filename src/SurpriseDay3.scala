package com.knoldus.rock

import scala.util.Try

object SurpriseDay3 extends App {
  val num1 = Some(2)
  val num2 = Some(3)
  val num3 = Some(4)
  //   val sumTotal = (num1,num2,num3) match {
  //     case (Some(first), Some(second), Some(third)) => first + second + third
  //     case _ => None
  //
  //  }
  //using flatMap and map
  val sumTotal: Option[Int] = num1.flatMap(first =>
    (num2.flatMap(second =>
      (num3.map(third =>
        (first + second + third))))))

  //using for comprehension
  val result = for {
    n1 <- num1
    n2 <- num2
    n3 <- num3
  } yield n1 + n2 + n3

  println(s"the total sum is $sumTotal")
  println(result)


  val one = Try(2)
  val two = Try(2)
  val three = Try(1)
  val four = Try(2)

  val output = for {
    x <- one
    y <- two
    z <- three
    h <- four
    if (x == y)
  } yield x + y - z + h
  println(output)
}

