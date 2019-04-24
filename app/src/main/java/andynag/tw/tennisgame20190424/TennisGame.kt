package andynag.tw.tennisgame20190424

class TennisGame {

    enum class ScoreMapping(val result: String) {
        ZERO("Love"),
        ONE("Fifteen")
    }

    var player2Score = 0
    var player1Score = 0

    fun getGameResult(): String {

        if(isMatchPoint()){
            if (player1Score == 4 && player2Score == 0) {
                return "Foo win"
            }
        }

        val scoreMap = mapOf<Int, String>(
            0 to "Love",
            1 to "Fifteen",
            2 to "Thirty",
            3 to "Forty"
        )

        if(player1Score == 1 && player2Score == 0) {
            return "Fifteen/Love"
        } else if(player1Score == 2 && player2Score == 0) {
            return "Thirty/Love"
        } else if (player1Score == 3 && player2Score == 0) {
            return "Forty/Love"
        }
        return "Love all"
    }

    private fun isMatchPoint():Boolean{
        return player1Score >= 3 || player2Score >= 3
    }

}
