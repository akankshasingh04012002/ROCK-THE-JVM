package com.knoldus.rockthejvm

object Session5 extends App {
  private val queueString = new Queue[String]
  queueString.insert("akku")
  queueString.insert("shivi")
  queueString.display()

  private val queueInt = new Queue[Int]
  queueInt.insert(10)
  queueInt.insert(20)
  queueInt.display()

  private val queueAnimal = new Queue[Animal]
  queueAnimal.insert(Cat)
  queueAnimal.insert(Dog)
  queueAnimal.display()

  private val polymorphicMethods = new PolymorphicMethods
  private val listInt: List[Int] = List(5, 7, 8, 9)
  private val resultInt = polymorphicMethods.doubleElement[Int](Seq.empty[Int], listInt, 10)
  println("resultInt:" + resultInt)
}

class Queue[A] {
  private var elements: List[A] = List.empty

  def insert(value: A): Unit = {
    elements = elements :+ value
  }

  def display(): Unit = {
    println("elements in the queue " + elements)
  }
}

trait Animal

object Cat extends Animal

object Dog extends Animal

object Lion extends Animal

class PolymorphicMethods {
  def doubleElement[A](seq: Seq[A], elements: List[A], times: Int): Seq[A] = {
    if (times < 1) {
      seq
    }
    else {
      doubleElement(seq ++ elements, elements, times - 1)
    }
  }
}