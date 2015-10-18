package engines

import model._

case class RockPaperScissorsEngine() extends Engine {

  override def toString = "Rock-Paper-Scissors"

  def play(choice1:Choice, choice2:Choice):Result = {
    if (choice1 == choice2) Draw
    else if (choice1.defeats == choice2) Victory
    else Defeat
  }

}
