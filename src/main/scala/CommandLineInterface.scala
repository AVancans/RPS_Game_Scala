import model._

case class CommandLineInterface(game:Engine) {

  def start = {
    println(s"Welcome to $game!")

    val player = getPlayer1
    val opponent = Computer

    val playerChoice: Choice = player.getChoice
    val opponentChoice: Choice = opponent.getChoice

    println(s"$player chose $playerChoice and opponent chose $opponentChoice")
    val result = game.play(playerChoice, opponentChoice)

    printResults(result, player)
  }

  def getPlayer1:Player = {
    println("1: Player vs Computer")
    println("2: Computer vs Computer")
    val mode = io.StdIn.readLine()

    mode match {
      case "1" => Human
      case _ => Computer
    }
  }

  def printResults(result:Result, player:Player) = {
    result match {
      case Victory => println(s"$player won!")
      case Draw => println("Draw!")
      case Defeat => println(s"$player lose!")
    }
  }

}
