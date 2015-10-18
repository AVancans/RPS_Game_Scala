import engines.RockPaperScissorsEngine
import model._

case object Application extends App {

  val game = RockPaperScissorsEngine()

  val cli = CommandLineInterface(game)
  cli.start

}
