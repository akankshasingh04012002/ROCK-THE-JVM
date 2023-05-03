package com.knoldus.rockthejvm


import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object FuturePractice {

}


def getFutureSuccessValue (number: Int): Future[Int] = Future.successful(number)

def getForYieldOperations(n: Future[Int], m: Future[Int], r: Future[Int], q: Future[Int]): Future[Int] = {
  for {
    nValue <- n
    mValue <- m
    rValue <- r
    qValue <- q
  } yield (nValue + mValue + rValue + qValue)
}

def getFutureValue: Future[String] = Future("This is Future String")

def getMappedValues(number1: Future[Int], number2: Future[Int]): Future[Future[Int]] = {
  number1.map { number1Value =>
    number2.map { number2Value =>
      (number1Value + number2Value)
    }
  }
}

def getFlatMappedValue(number1: Future[Int], number2: Future[Int]): Future[Int] = {
  number1.flatMap { number1Value =>
    number2.map { number2Value =>
      (number1Value + number2Value)
    }
  }
}

def getFutureValues(number: Future[Int]): Unit = {
  number.onComplete {
    case Failure(exception) => throw new RuntimeException(exception.getMessage)
    case Success(value) => value
  }
}

def getAwaitedValues(number: Future[Int]): Int = {
  Await.result(number, Duration.Inf)
}

