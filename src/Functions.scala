package com.knoldus.rockthejvm


object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 5))

  def aParameterLessFunction(): Int = 20

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString + " " + n
    else aString + " " + n + " " + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = (println(aString))

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  def greeting(name: String, age: Int): String = "Hello, my name is " + name + " and I'm " + age + " years old.."

  println(greeting("Akanksha", 21))

  def factorial(n: Int): Int =
    if (n == 0) 1
    else n * factorial(n - 1)

  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else (fibonacci(n - 1) + fibonacci(n - 2))

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(m: Int): Boolean =
      if (m <= 1) true
      else n % m != 0 && isPrimeUntil(m - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))

}
