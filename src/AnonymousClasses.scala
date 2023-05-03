package com.knoldus.rockthejvm

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahhaha")
  }
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHii: Unit = println(s"hi, my name is $name")
  }

  val jim = new Person("JIm") {
    override def sayHii: Unit = println(s"hi, my name is jim how can i help you")


  }
}
