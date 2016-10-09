package com.github.b96705008.akka.ch5_cluster.remoting

import akka.actor.Actor
import akka.actor.Actor.Receive


class Worker extends Actor {
  import Worker._

  override def receive: Receive = {
    case msg: Work =>
      println(s"I received Work Message and My ActorRef: $self")
  }
}

object Worker {
  case class Work(message: String)
}
