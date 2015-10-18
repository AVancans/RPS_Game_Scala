package model

import java.awt.Choice

import scala.util.Random

trait Player {
  def getChoice:Choice
}

case object Human extends Player {
  override def toString = "You"
  override def getChoice:Choice= {
    println("Please enter your choice:")
    println("1: Rock")
    println("2: Paper")
    println("3: Scissors")

    val choice = io.StdIn.readLine()

    choice match {
      case "1" =>  Rock
      case "2" =>  Paper
      case "3" =>  Scissors
    }
  }
}


case object Computer extends Player {
  override def toString = "Computer"
  override def getChoice: Choice = {
    Random.shuffle(List(Rock, Paper, Scissors)).head
  }
}
