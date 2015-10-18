package model

trait Result
case object Victory extends Result {
  override def toString = "Victory"
}
case object Draw extends Result {
  override def toString = "Draw"
}
case object Defeat extends Result {
  override def toString = "Defeat"
}