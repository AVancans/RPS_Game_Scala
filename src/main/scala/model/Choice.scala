package model

trait Choice {
  def defeats: Choice
}

case object Rock extends Choice {
  override def defeats: Choice = Scissors
  override def toString: String = "Rock"
}

case object Scissors extends Choice {
  override def defeats: Choice = Paper
  override def toString: String = "Scissors"
}

case object Paper extends Choice {
  override def defeats: Choice = Rock
  override def toString: String = "Paper"
}