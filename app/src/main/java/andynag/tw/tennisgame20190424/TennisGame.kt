package andynag.tw.tennisgame20190424

class TennisGame {

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

            if (player2Score == player1Score) {
                return "Deuce"
            }

            if (player1Score == 4 && player2Score == 0) {
                return "Foo win"
            }

            return if((player1Score - player2Score) < 0) {
                 "Advantage, Bar"
            } else {
                "Advantage, Foo"
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

    }

    private fun isPlay(){

    }

    private fun isDeuce(): Boolean {
        return (player1Score >=3 ||  player2Score >= 3) && player1Score == player2Score
    }

    private fun isMatchPoint(): Boolean {
        return (player1Score > 3 || player2Score > 3)
    }

}
