package com.knoldus.rockthejvm

object PatternMatchingPart2 extends App {
  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "THE SCALA"
    case true => "The truth"
    case PatternMatchingPart2 => "A singleton object"
  }
  val matchAnything = x match {
    case _ =>
  }

  val matchVariable = x match {
    case something => s"I have found $something"
  }
  val aTuple = (1, 2)
  val matchATuple = aTuple match {
    case (1, 1) =>
    case (something, 2) => s"I've found $something"
  }

  val nestedTuple = (1, (2, 3))
  val matchNestedTuple = nestedTuple match {
    case (_, (2, v)) =>
  }

  val aList: List[Any] = List(1, List(2, Empty))
  val matchAList = aList match {
    case empty =>
    case List(head, List(subhead, subtail)) =>
  }

  val aStandardList = List(1, 2, 3, 42)
  val standardListMatching = aStandardList match {
    case List(1, _, _, _) => //extractor
    case List(1, _*) => //list of arbitrary
    case 1 :: List(_) => //infix pattern
    case List(1, 2, 3) :+ 42 =>
  }

  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => //explicit type specifier
    case _ =>
  }

  //name binding
  val nameBindingMatch = aList match {
    case nonEmptyList@List(_, _) =>
    case List(1, rest@List(2, _)) =>
  }

  val num = List(1, 2, 3)
  private val numMatch = num match {
    case listOfStrings: List[String] => "a list of strings"
    case listOfNumbers: List[Int] => "a list of numbers"
    case _ =>
  }
  println(constants)
  println(matchVariable)
  println(matchATuple)
  println(matchNestedTuple)
  println(matchAList)
  println(standardListMatching)
  println(numMatch)
}

