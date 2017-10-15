package io.kolbe.akka

import akka.actor.Actor

class SimpleActor extends Actor {

  def receive = {
    case s: String => println("String: "+s)
    case i:Int => println("Int: "+i.toString)
  }
}