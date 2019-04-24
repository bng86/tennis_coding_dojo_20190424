package andynag.tw.tennisgame20190424

import org.junit.Assert.assertEquals
import org.junit.Test

class TennisGameTest {

    @Test
    fun `test love all`() {
        val target = TennisGame()
        val actual: String = target.getGameResult()
        assertEquals("Love all", actual)
    }

    @Test
    fun `test 1-0 then return Fifteen Love`() {
        val target = TennisGame()
        val actual = target.getGameResult()
        target.setPlayer1Score(1)
        target.setPlayer2Score(0)
        assertEquals("Fifteen/Love", actual)
    }
}