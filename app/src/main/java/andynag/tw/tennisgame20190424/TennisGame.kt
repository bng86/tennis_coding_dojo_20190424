package andynag.tw.tennisgame20190424

class TennisGame {

    enum class ScoreMapping(val result: String) {
        zero("Love")
    }

    var player2Score = 0
    var player1Score = 0

    fun getGameResult(): String {
        if(player1Score == 1 && player2Score == 0) {
            return "Fifteen/Love"
        } else if(player1Score == 2 && player2Score == 0) {
            return "Thirty/Love"

        }
        return "Love all"
    }

}
