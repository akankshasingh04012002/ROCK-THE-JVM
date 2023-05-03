package com.knoldus.rockthejvm

import scala.util.Random

object PatternMatching extends App {
  val random = new Random
  val value = random.nextInt(10)
  val description = value match {
    case 1 => "the one"
    case 2 => " double or nothing"
    case _ => "something else"
  }
  println(value)
  println(description)

  case class Person(name: String, age: Int)

  val bob = Person("Bob", 20)

  val greet = bob match {
    case Person(n, a) if a < 21 => s"Hey, my name is $n and I cant drink"
    case Person(n, a) => s" Hi , my name is $n and I am $a years old"
    case _ => "I dont know my name"
  }
  println(greet)

  //PM on sealed hierarchy
  sealed class Animal

  case class Dog(breed: String) extends Animal

  case class Parrot(greet: String) extends Animal

  val animal: Animal = Dog("terra nova")
  animal match {
    case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
  }

  //match everything
  val isEven = value match {
    case n if n % 2 == 0 => true
    case _ => false
  }
  val isEvenCond = if (value % 2 == 0) true else false
  val isEvenNormal = value % 2 == 0

  //trait
  trait Expr

  case class Number(n: Int) extends Expr

  case class Sum(e1: Expr, e2: Expr) extends Expr

  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(e: Expr): String = e match {
    case Number(n) => s"$n"
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
    case Prod(e1, e2) => {
      def mayBeShowParantheses(exp: Expr) = exp match {
        case Prod(_, _) => show(exp)
        case Number(_) => show(exp)
        case _ => "(" + show(exp) + ")"
      }

      mayBeShowParantheses(e1) + " + " + mayBeShowParantheses(e2)
    }
  }

  println(show(Sum(Number(2), Number(3))))

}
