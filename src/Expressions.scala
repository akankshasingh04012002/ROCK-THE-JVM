package com.knoldus.rockthejvm

object Expressions extends App {
  val x = 1 + 2
  println(x)
  println(2 + 3 * 4)
  println(1 == x)
  var aVariable = 2
  aVariable += 3
  println(aVariable)
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    print(i)
    i += 1
  }
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  //code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"
  }
  println(aCodeBlock)

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if (someValue) 200 else 40
  }
  println(someOtherValue)


}
