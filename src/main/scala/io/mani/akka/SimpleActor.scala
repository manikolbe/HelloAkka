package io.kolbe.akka

import akka.actor.Actor

class SimpleActor extends Actor {
  var counter = 0
  var StartTimestamp: Long = System.currentTimeMillis

  def receive = {
    case s: String => {
      if((System.currentTimeMillis - StartTimestamp>1000)){
        println(counter + " messages received in last second")
        counter = 0
        StartTimestamp = System.currentTimeMillis
      }
      counter = counter +1
    }
    case i:Int => println("Int: "+i.toString)
  }
}