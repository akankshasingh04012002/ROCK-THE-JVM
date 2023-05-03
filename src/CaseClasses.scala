package com.knoldus.rockthejvm

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  //class parameters are fields
  val tom = new Person("Tom", 30)
  println(tom.name)
  //sensible toString
  println(tom.toString)

  //equals and hashcode
  val jim = new Person("Tom", 30)
  println(tom == jim)

  //case classes have handy copy method
  val john = tom.copy(age = 20)
  println(john)
  val syam = jim.copy(name = "shyam")
  println(syam)

  //case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  //case classes are serializable
  //CASE OBJECTS
  case object UnitedKingdom {
    def name: String = "the UK "
  }


}
