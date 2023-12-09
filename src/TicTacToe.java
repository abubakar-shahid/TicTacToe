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

    static int ending2Check(char[][] ttt, int row) {
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

    private static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while trying to clear the screen.");
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

        for (int turn = 0; turn < 10; turn++) {
            clearScreen();
            System.out.println("\n****************************** Welcome to FAST Tic-Tac-Toe ******************************\n");
            System.out.println("\n'X' is for Player.1 and 'O' is for Player.2\n");
            System.out.println("Enter box number for your turn (Starting from left ---> 1 to 9).\n");
            output(ttt, r);

            int win1 = ending1Check(ttt, r);
            if (win1 == 0) {
                System.out.println("\n************************************* Player 2 wins *************************************\n");
                break;
            } else if (win1 == 1) {
                System.out.println("\n*************************************** Game Draw ***************************************\n");
                break;
            }

            System.out.print("\nPlayer 1 turn: ");
            boolean check1 = true;
            Scanner scanner = new Scanner(System.in);
            while (check1) {
                input1 = scanner.nextInt();
                if (input1 < 1 || input1 > 9) {
                    System.out.println("\nPlease enter appropriate box number!!!\n");
                } else {
                    check1 = false;
                    break;
                }
            }

            boolean check3 = true;
            while (check3) {
                int x = 0;
                x = check1(ttt, r, input1, x);
                if (x == 0) {
                    check3 = false;
                    break;
                } else {
                    System.out.println("\nThis box is already occupied!!!\n");
                    input1 = scanner.nextInt();
                }
            }

            player1(ttt, r, input1);
            clearScreen();
            System.out.println("\n****************************** Welcome to FAST Tic-Tac-Toe ******************************\n");
            System.out.println("\n'X' is for Player.1 and 'O' is for Player.2\n");
            System.out.println("Enter box number for your turn (Starting from left ---> 1 to 9).\n");
            output(ttt, r);

            int win2 = ending2Check(ttt, r);
            if (win2 == 0) {
                System.out.println("\n************************************* Player 1 wins *************************************\n");
                break;
            } else if (win2 == 1) {
                System.out.println("\n*************************************** Game Draw ***************************************\n");
                break;
            }

            System.out.print("\nPlayer 2 turn: ");
            boolean check2 = true;
            while (check2) {
                input2 = scanner.nextInt();
                if (input2 < 1 || input2 > 9) {
                    System.out.println("\nPlease enter appropriate box number!!!\n");
                } else {
                    check2 = false;
                    break;
                }
            }

            boolean check4 = true;
            while (check4) {
                int x = 0;
                x = check2(ttt, r, input2, x);
                if (x == 0) {
                    check4 = false;
                    break;
                } else {
                    System.out.println("\nThis box is already occupied!!!\n");
                    input2 = scanner.nextInt();
                }
            }

            player2(ttt, r, input2);
        }
    }

}