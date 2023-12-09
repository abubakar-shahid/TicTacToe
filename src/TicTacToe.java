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

    static void player1(char[][] ttt, int row, int input1) {
        switch (input1) {
            case 1:
                ttt[0][0] = 'X';
                break;
            case 2:
                ttt[0][1] = 'X';
                break;
            case 3:
                ttt[0][2] = 'X';
                break;
            case 4:
                ttt[1][0] = 'X';
                break;
            case 5:
                ttt[1][1] = 'X';
                break;
            case 6:
                ttt[1][2] = 'X';
                break;
            case 7:
                ttt[2][0] = 'X';
                break;
            case 8:
                ttt[2][1] = 'X';
                break;
            case 9:
                ttt[2][2] = 'X';
                break;
        }
    }

    static void player2(char[][] ttt, int row, int input2) {
        switch (input2) {
            case 1:
                ttt[0][0] = 'O';
                break;
            case 2:
                ttt[0][1] = 'O';
                break;
            case 3:
                ttt[0][2] = 'O';
                break;
            case 4:
                ttt[1][0] = 'O';
                break;
            case 5:
                ttt[1][1] = 'O';
                break;
            case 6:
                ttt[1][2] = 'O';
                break;
            case 7:
                ttt[2][0] = 'O';
                break;
            case 8:
                ttt[2][1] = 'O';
                break;
            case 9:
                ttt[2][2] = 'O';
                break;
        }
    }

    static int check1(char[][] ttt, int row, int input1, int x) {
        if (input1 == 1) {
            return (ttt[0][0] != '*') ? 1 : 0;
        } else if (input1 == 2) {
            return (ttt[0][1] != '*') ? 1 : 0;
        } else if (input1 == 3) {
            return (ttt[0][2] != '*') ? 1 : 0;
        } else if (input1 == 4) {
            return (ttt[1][0] != '*') ? 1 : 0;
        } else if (input1 == 5) {
            return (ttt[1][1] != '*') ? 1 : 0;
        } else if (input1 == 6) {
            return (ttt[1][2] != '*') ? 1 : 0;
        } else if (input1 == 7) {
            return (ttt[2][0] != '*') ? 1 : 0;
        } else if (input1 == 8) {
            return (ttt[2][1] != '*') ? 1 : 0;
        } else if (input1 == 9) {
            return (ttt[2][2] != '*') ? 1 : 0;
        }
        return 0;
    }

    static int check2(char[][] ttt, int row, int input2, int x) {
        if (input2 == 1) {
            return (ttt[0][0] != '*') ? 1 : 0;
        } else if (input2 == 2) {
            return (ttt[0][1] != '*') ? 1 : 0;
        } else if (input2 == 3) {
            return (ttt[0][2] != '*') ? 1 : 0;
        } else if (input2 == 4) {
            return (ttt[1][0] != '*') ? 1 : 0;
        } else if (input2 == 5) {
            return (ttt[1][1] != '*') ? 1 : 0;
        } else if (input2 == 6) {
            return (ttt[1][2] != '*') ? 1 : 0;
        } else if (input2 == 7) {
            return (ttt[2][0] != '*') ? 1 : 0;
        } else if (input2 == 8) {
            return (ttt[2][1] != '*') ? 1 : 0;
        } else if (input2 == 9) {
            return (ttt[2][2] != '*') ? 1 : 0;
        }
        return 0;
    }

    static int ending1Check(char[][] ttt, int row) {
        if ((ttt[0][0] == ttt[0][1] && ttt[0][1] == ttt[0][2] && ttt[0][0] != '*' && ttt[0][1] != '*' && ttt[0][2] != '*') ||
                (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && ttt[0][0] != '*' && ttt[1][1] != '*' && ttt[2][2] != '*') ||
                (ttt[0][0] == ttt[1][0] && ttt[1][0] == ttt[2][0] && ttt[0][0] != '*' && ttt[1][0] != '*' && ttt[2][0] != '*') ||
                (ttt[0][2] == ttt[1][2] && ttt[1][2] == ttt[2][2] && ttt[0][2] != '*' && ttt[1][2] != '*' && ttt[2][2] != '*') ||
                (ttt[2][0] == ttt[2][1] && ttt[2][1] == ttt[2][2] && ttt[2][0] != '*' && ttt[2][1] != '*' && ttt[2][2] != '*') ||
                (ttt[0][2] == ttt[1][1] && ttt[1][1] == ttt[2][0] && ttt[0][2] != '*' && ttt[1][1] != '*' && ttt[2][0] != '*') ||
                (ttt[0][1] == ttt[1][1] && ttt[1][1] == ttt[2][1] && ttt[0][1] != '*' && ttt[1][1] != '*' && ttt[2][1] != '*') ||
                (ttt[1][0] == ttt[1][1] && ttt[1][1] == ttt[1][2] && ttt[1][0] != '*' && ttt[1][1] != '*' && ttt[1][2] != '*'))
            return 0;
        else if (ttt[0][0] != '*' && ttt[0][1] != '*' && ttt[0][2] != '*' && ttt[1][0] != '*' && ttt[1][1] != '*' && ttt[1][2] != '*' && ttt[2][0] != '*' && ttt[2][1] != '*' && ttt[2][2] != '*')
            return 1;
        else
            return 2;
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