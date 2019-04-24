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
        target.player1Score = 1
        target.player2Score = 0
        val actual = target.getGameResult()


        assertEquals("Fifteen/Love", actual)
    }

    @Test
    fun `test 2-0 then return Thirty Love`() {
        val target = TennisGame()
        target.player1Score = 2
        target.player2Score = 0
        val actual = target.getGameResult()


        assertEquals("Thirty/Love", actual)
    }

    @Test
    fun `test 3-0 then return Forty Love`() {
        val target = TennisGame()
        target.player1Score = 3
        target.player2Score = 0
        val actual = target.getGameResult()
        assertEquals("Forty/Love", actual)
    }

    @Test
    fun `test 4-0 then return Foo Win`() {
        val target = TennisGame()
        target.player1Score = 4
        target.player2Score = 0
        val actual = target.getGameResult()
        assertEquals("Foo win", actual)
    }
}