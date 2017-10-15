package io.kolbe.akka

import akka.actor.{Actor, ActorSystem, Props}

object HelloAkka extends App {

  val system = ActorSystem("simplesystem")
  val actor = system.actorOf(Props[SimpleActor], "SimpleActor")
  val StartTimestamp: Long = System.currentTimeMillis
  while(System.currentTimeMillis - StartTimestamp<10000) {
    actor !   "hello"
  }
  Thread.sleep(5000)
  system.terminate()
}
