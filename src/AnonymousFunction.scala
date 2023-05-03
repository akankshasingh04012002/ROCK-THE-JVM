package com.knoldus.rockthejvm

import jdk.internal.org.objectweb.asm.util.Printer

object AnonymousFunction extends App {

  //anonymous Function
  val doubler: Int => Int = x => x * 2

  //multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //no params
  val justDo: () => Int = () => 3
  println(justDo())

  //curly braces with lambda
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //syntactic sugar
  val niceIncrementar: Int => Int = _ + 1 //equivalent to x=> x + 1
  val niceAdder: (Int, Int) => Int = _ + _ //(a, b) => a + b

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
