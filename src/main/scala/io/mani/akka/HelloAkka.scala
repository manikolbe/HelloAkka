package io.kolbe.akka

import akka.actor.{Actor, ActorSystem, Props}

object HelloAkka extends App {

  val system = ActorSystem("simplesystem")
  val actor = system.actorOf(Props[SimpleActor], "SimpleActor")

  actor !   "hello"
  actor !   122111
}
