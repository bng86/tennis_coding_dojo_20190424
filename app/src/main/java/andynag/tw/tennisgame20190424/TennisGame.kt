package andynag.tw.tennisgame20190424

class TennisGame {

    enum class ScoreMapping(val result: String) {
        ZERO("Love"),
        ONE("Fifteen")
    }

    var player2Score = 0
    var player1Score = 0

    fun getGameResult(): String {
        if(player1Score == 1 && player2Score == 0) {
            return "Fifteen/Love"
        } else if(player1Score == 2 && player2Score == 0) {
            return "Thirty/Love"
        } else if (player1Score == 3 && player2Score == 0) {
            return "Forty/Love"
        } else if (player1Score == 4 && player2Score == 0) {
            return "Foo win"
        }
        return "Love all"
    }

}
