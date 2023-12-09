import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testPlayer1() {
        char[][] ttt = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        TicTacToe.player1(ttt, 3, 1);
        assertEquals('X', ttt[0][0]);
    }

    @Test
    void testPlayer2() {
        char[][] ttt = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        TicTacToe.player2(ttt, 3, 5);
        assertEquals('O', ttt[1][1]);
    }

    @Test
    void testCheck1Occupied() {
        char[][] ttt = new char[][]{{'X', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        int result = TicTacToe.check1(ttt, 3, 1, 0);
        assertEquals(1, result);
    }

    @Test
    void testCheck2Occupied() {
        char[][] ttt = new char[][]{{'X', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        int result = TicTacToe.check2(ttt, 3, 1, 0);
        assertEquals(1, result);
    }

    @Test
    void testCheck1NotOccupied() {
        char[][] ttt = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        int result = TicTacToe.check1(ttt, 3, 1, 0);
        assertEquals(0, result);
    }

    @Test
    void testCheck2NotOccupied() {
        char[][] ttt = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        int result = TicTacToe.check2(ttt, 3, 1, 0);
        assertEquals(0, result);
    }

    @Test
    void testEnding1CheckPlayer1Wins() {
        char[][] ttt = new char[][]{{'X', 'O', 'X'}, {'O', 'X', '*'}, {'*', '*', 'X'}};
        int result = TicTacToe.ending1Check(ttt, 3);
        assertEquals(0, result);
    }

    @Test
    void testEnding1CheckGameDraw() {
        char[][] ttt = new char[][]{{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'O', 'X', 'X'}};
        int result = TicTacToe.ending1Check(ttt, 3);
        assertEquals(1, result);
    }

    @Test
    void testEnding1CheckContinueGame() {
        char[][] ttt = new char[][]{{'X', 'O', '*'}, {'O', '*', 'O'}, {'*', 'X', 'X'}};
        int result = TicTacToe.ending1Check(ttt, 3);
        assertEquals(2, result);
    }

}