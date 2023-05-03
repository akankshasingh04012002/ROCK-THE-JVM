package com.knoldus.rockthejvm

object OOBasics extends App {
  val person = new Person("Akanksha", 21)
  println(person.age)
  println(person.x)
  person.greet("Shivi")

  val author = new Writer("charles", "dickens", 1812)
  //val imposter = new Writer("charles", "dickens",1812)
  val novel = new Novel("Great Exceptations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.print

}

class Person(name: String, val age: Int) {
  val x = 2
  println(3 + 4)

  def greet(name: String): Unit = println(s"${this.name} says: Hello , $name")

  def greet(): Unit = println(s"Hi, I am $name")
}

//class parameters are not fields
class Writer(firstName: String, surname: String, val year: Int) {

  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {

  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)

}
