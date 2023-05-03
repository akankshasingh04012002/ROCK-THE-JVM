package com.knoldus.rockthejvm

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String = "wild"

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit

    val prefferedmeal: String = "meat"
  }

  trait Coldblooded

  class Crocodile extends Animal with Carnivore with Coldblooded {
    override val creatureType: String = "croc"

    override def eat: Unit = "nom"

    def eat(animal: Animal): Unit = println(s"I am a croc and I am eating ${animal.creatureType}")
  }

  val dog = new Dog
  private val croc = new Crocodile
  croc.eat(dog)

}
