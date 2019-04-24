package andynag.tw.tennisgame20190424

class TennisGame {

    enum class ScoreMapping(val result: String) {
        ZERO("Love"),
        ONE("Fifteen")
    }

    var player2Score = 0
    var player1Score = 0

    private val scoreMap = mapOf(
        0 to "Love",
        1 to "Fifteen",
        2 to "Thirty",
        3 to "Forty"
    )

    fun getGameResult(): String {

        if (isMatchPoint()) {
//            return when(val abs = Math.abs(player1Score - player2Score)) {
//               0 ->  "Deuce"
//                1 ->  "advantage"
//                2 - >
//            }

            if (player2Score == player1Score) {
                return "Deuce"
            }

            if (player1Score == 4 && player2Score == 0) {
                return "Foo win"
            }

            if ((player1Score - player2Score) < 0) {
                return "Advantage, Bar"
            } else {
                return "Advantage, Foo"
            }
        }

        if(isDeuce()) {
            return "Deuce"


        }


        return if (player1Score == player2Score) {
            "${scoreMap[player1Score]} all"
        } else {
            "${scoreMap[player1Score]}/${scoreMap[player2Score]}"
        }


//        return "Love all"
    }

    private fun isDeuce(): Boolean {
        return (player1Score >=3 ||  player2Score >= 3) && player1Score == player2Score
    }

    private fun isMatchPoint(): Boolean {
        return (player1Score > 3 || player2Score > 3)
    }

}
