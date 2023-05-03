package com.knoldus.rockthejvm

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def +(nickname: String): Person = new Person(s"$name ($nickname", favouriteMovie)

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?"

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"

    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"

    def learns(things: String) = s"$name is learning $things"

    def learnsScala = this learns "Scala"
  }

  private val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation = operator notation {syntactic sugar}

  //"operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))
  println(1 + 2)
  println(1.+(2))

  //all operators are methods

  //prefix notation
  val x = -1
  val y = 1.unary_-
  //unary_ prefix
  println(mary.unary_!)
  println(!mary)

  //postfix
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

  println((mary + "the rockstar")())
  println((mary + "the rockstar").apply())
  println((+mary).age)
  println(x)
  println(y)
  println(mary learnsScala)
  println(mary(10))


}
