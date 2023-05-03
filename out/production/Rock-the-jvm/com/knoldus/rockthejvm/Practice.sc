//covariant
object Session4 extends App {
  def display(parents: List[Parent]): Unit = {
    parents.foreach { parent =>
      println(parent.name)
    }
  }
}
val firstChild = List(FirstChild("shivi"),FirstChild("shiva"))
val secondChild = List(SecondChild("akanksha"),SecondChild("akku"))
display(firstChild)
display(secondChild)

abstract class Parent {
  val name: String
}
case class FirstChild(name: String) extends Parent
case class SecondChild(name: String) extends Parent

//contravariant

abstract class Show[-T]
{
  def print(value: T):Unit
}
abstract class Vehicle
{
  def name: String
}
case class Car(name:String) extends Vehicle
class VehicleShow extends Show[Vehicle]
  {
   def print(vehicle: Vehicle):Unit =
     println(car.name)
  }
class CarShow extends Show[Car]
{
  def print(car: Car)
}
object Contavariance extends App{
  val newCar: Car = Car("scorpio")
  def printnewCar(show: Show[Car]): Unit =
  {
    show.print(newCar)
  }
  val showcar: Show[Car] = new CarShow
  val showvehicle: Show[Vehicle] = new VehicleShow

  printnewCar(showcar)
  printnewCar(showvehicle)
}



//implicit practice
//object session4 extends App{
  private val patternMatch = new PatternMatch
  private val list = List("rahul","bhavya", "bhavesh")
  println(patternMatch.handleFind(list))
}

case class Person(name: String, age:Int ,address:String)
class PatternMatch{
  def patternMatching(value:Any) = {
    value match {
      case 10 => println("int matched")
      case "Bhavya" => println("string matched")
      case true => println("boolean found")
      case _ => println("wildcard matched")
    }
  }
  def constructorPattern(person: Person): Unit = {
    person match{
      case Person("Bhavya", 10, _) => println("name and age matched")
      case Person(_, 25, _) => println("age matched")
      case Person(_, _ ,_) => println("all values matched")
    }
  }
  def tuplePattern(value: Any):Unit = {
    value match{
      case (firstvalue, secondvalue) => println(s"values in tuple - $firstvalue,$secondvalue")
      case (firstvalue, secondvalue, thirdvalue) => println(s"tuple -$firstvalue, $secondvalue, $thirdvalue")
      case _ => println("wildcard matched")
    }
  }
  def optionsPattern(value: Option[String]) = {
    value match{
      case Some(value) => println(s"Some found - $value")
      case None => println("none matched")
    }
  }
  def listPattern(list: List[String]): Unit = {
    list match {
      case head :: Nil => println("head of list :" +head)
      case head :: tail => println("head of list:" + head + "\n tail of list:" + tail)
      case Nil => println("Nil found")
    }
  }
  def higherOrderFunction(names: List[String]): Unit ={
    names.foreach{ name =>
      if(name == "bhavya") {
        println(name)
      }
      else{
        println("else case")
      }
    }
    def handleFlatmap(names: List[Option[String]]): List[String] = {
      names.flatMap { maybeName =>
          maybeName.map { name =>
            name.toUpperCase
          }
      }
    }
    def handleFlatmap2(names: Option[Option[String]]): Option[String] ={
      names.flatMap { name =>
        name.map { finalName =>
          finalName.toUpperCase()
        }
      }
    }
    def handleFilter(names: List[String]): List[String] ={
      names.filterNot(name => name.startsWith("Bh"))
    }
    def handleFind(names: List[String]): Option[String] ={
      names.find(name => name.startsWith(("Bh")))
    }
  }
}
