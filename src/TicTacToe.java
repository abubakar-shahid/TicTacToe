import java.util.Scanner;

public class TicTacToe {

    static void output(char[][] ttt, int row) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + ttt[i][j] + "  ");
            }
            System.out.println("\n\n");
        }
    }

    public static void main(String[] args) {
        final int r = 3, c = 3;
        int input1 = 0, input2 = 0;
        char[][] ttt = new char[r][c];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ttt[i][j] = '*';
            }
        }
    }

}