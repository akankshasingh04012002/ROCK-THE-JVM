package com.knoldus.rockthejvm

object Extractors extends App {

  private val akanksha = new Person("Akanksha", 21, "F")
  private val shivi = new Person("Shivi", 21, "F")
  val employee = User("5678")
  private val result = akanksha match {
    case Person(n, a, g) =>
      if (g.equals("F")) s"Person with name $n and age $a is a female"
      else s"Person with name $n and age $a is a male"
    case _ => "No person could be extracted"
  }
  private val resultWithGuard = shivi match {
    case Person(n, a, g) if g.equals("M") => s"IfGuard:Person with name $n and age $a is Male"
    case Person(n, a, g) if g.equals("F") => s"IfGuard:Person with name $n and age $a is a female"
    case Person(n, a, _) => s"Could not determine gender with name $n and age $a"
  }

  println(result)
  println(resultWithGuard)
}

case class User(id: String)

class Person(val name: String, val age: Int, val gender: String)

object Person {
  //      def apply(name: String): Person = new Person(name, 10)
  //
  //      def apply(name: String, age: Int): Person = new Person(name, age)


  def unapply(person: Person): Option[(String, Int, String)] = {
    Some(person.name, person.age, person.gender)
  }
}

