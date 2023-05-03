package com.knoldus.rockthejvm

object Inheritance extends App {
  sealed class Animal {
    val creaturetype = "wild"

    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  private val cat = new Cat
  cat.crunch

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog(override val creaturetype: String) extends Animal {
    //override val creaturetype = "domestic"

    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creaturetype)

  //type substitution
  val unknown: Animal = new Dog("K9")
  unknown.eat
  //seal the class = extend classes in this file, prevent extension in other file

}
