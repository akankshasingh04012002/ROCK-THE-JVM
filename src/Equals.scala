package com.knoldus.rockthejvm

object Equals extends App {

  val list1 = List(1)
  val list2 = List(2)
  //val list3 = List(3)
  val list4 = List(1)
  val list3 = list1

  println(list3 eq list1)

  println(list1 == list2)
  println(list1 == list4)
  println(list1.equals(list4))
  println(list1 equals (list3))
  println(list1 eq list3)
  println(list1 eq list4)
}
