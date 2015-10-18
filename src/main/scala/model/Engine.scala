package model

trait Engine {
  def play(choiceA:Choice, choiceB:Choice):Result
}
