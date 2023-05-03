package com.knoldus.rockthejvm

import java.util.concurrent.locks.ReentrantLock

object threadPractice extends App {

  object ThreadOne extends Thread {
    override def run(): Unit = {
      println("thread one started")
      println("threadone finished")
    }
  }

  object ThreadTwo extends Thread {
    override def run(): Unit = {
      println("thread two started")
      println("thread two ended")
    }
  }

  ThreadOne.start()
  ThreadTwo.start()
  ThreadOne.join()
  ThreadTwo.join()

  val lock = new ReentrantLock()
  lock.lock()
  try {
    println("lock acquired")
  }
  finally {
    lock.unlock()
    println("lock is released")
  }
  //synchronized


}
