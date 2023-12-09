import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testPlayer1() {
        char[][] ttt = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        TicTacToe.player1(ttt, 3, 1);
        assertEquals('X', ttt[0][0]);
    }

}