package andynag.tw.tennisgame20190424

class TennisGame {

    private val player1: String = "Foo"
    private val player2: String = "Bar"

    var player2Score = 0
    var player1Score = 0

    private val scoreMap = mapOf(
        0 to "Love",
        1 to "Fifteen",
        2 to "Thirty",
        3 to "Forty"
    )

    fun getGameResult(): String {

        return when {
            hasWinner() -> "${getWinner()} win"
            hasAdvantage() -> "Advantage, ${getWinner()}"
            isDeuce() -> "Deuce"
            else -> {
                if (isSameScore()) {
                    "${scoreMap[player1Score]} all"
                } else {
                    "${scoreMap[player1Score]}/${scoreMap[player2Score]}"
                }
            }
        }

    }

    private fun hasAdvantage() = isGamePoint() && Math.abs(player1Score - player2Score) == 1

    private fun getWinner() = if (player1Score > player2Score) player1 else player2

    private fun hasWinner() = isGamePoint() && Math.abs(player1Score - player2Score) >= 2

    private fun isGamePoint() = player1Score >= 4 || player2Score >= 4

    private fun isDeuce(): Boolean {
        return (player1Score >= 3 || player2Score >= 3) && isSameScore()
    }

    private fun isSameScore() = player1Score == player2Score

}
