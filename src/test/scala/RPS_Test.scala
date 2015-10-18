import engines.RockPaperScissorsEngine
import model._
import org.scalatest.{Matchers, FlatSpec}


class RPS_Test extends FlatSpec with Matchers {


  "Player 1 " should " win given he picks Rock and enemy picks Scissors" in {
    val rpcGameEngine = RockPaperScissorsEngine()
    val result = rpcGameEngine.play(Rock, Scissors)
    result should be (Victory)
  }

  "Player 1 " should " lose given he picks Rock and enemy picks Paper" in {
    val rpcGameEngine = RockPaperScissorsEngine()
    val result = rpcGameEngine.play(Rock, Paper)
    result should be (Defeat)
  }

  it should "be a draw given Player 1 and Enemy pick the same choice" in {
    val rpcGameEngine = RockPaperScissorsEngine()
    val result = rpcGameEngine.play(Rock, Rock)
    result should be (Draw)

    val result1 = rpcGameEngine.play(Paper, Paper)
    result1 should be (Draw)

    val result2 = rpcGameEngine.play(Scissors, Scissors)
    result2 should be (Draw)
  }

  "Player 1 " should " win given he picks Paper and enemy picks Scissors" in {
    val rpcGameEngine = RockPaperScissorsEngine()
    val result = rpcGameEngine.play(Paper, Scissors)
    result should be (Defeat)
  }

}
