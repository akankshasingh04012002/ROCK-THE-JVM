package com.knoldus.rockthejvm

object Objects extends App {
  //scala does not have class level functionality
  object Person {
    val N_EYES = 2

    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person(("BOBBIE"))
  }

  class Person(val name: String) {

  }
  //COMPANIONS
  println(Person.N_EYES)
  println(Person.canFly)

  //scala object = singleton instance
  val mary = new Person("Marry")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person.apply(mary, john)


}
