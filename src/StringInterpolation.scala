package com.knoldus.rockthejvm

object StringInterpolation {
  def main(args: Array[String]) {

    val x = 10020.20
    val y = 10
    val name = "shivi"
    println(s"$name")

    val thename = "Alice"
    val age = 25
    println(s"My name is $thename and I am $age years old.")

    val str1 = "Sum of $x and $y is ${x+y}"
    val str2 = s"Sum of $x and $y is ${x + y}"

    println("str1: " + str1)
    println("str2: " + str2)
    val str3 = f"Value of x is $x%7.3f"
    println(str3)
    val str4 = raw"Hello\nWorld"
    println(str4)
    val str5 = f"$y%5.4f"
    println(str5)


  }
}
