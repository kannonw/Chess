package Runtime;

import Pieces.Piece;
import Pieces.Position;

public class Screen {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private static final String RED = "\033[0;31m";

    private static final String ANSI_RESET = "\u001B[0m";

    public static void UpdateBoard(Piece[][] board) {
        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%d  ", 8 - i);

            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j] != null) {
                    System.out.printf("%s%c%s ", board[i][j].getColor().getStringColor(), board[i][j].getLetter(), ANSI_RESET);
                } else {
                    System.out.print("· ");
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < WIDTH; i++) {
            System.out.printf(" %s", Character.toString(97 + i));
        }
        System.out.println();
    }

    public static void UpdateBoard(Piece[][] board, boolean[][] validMoves) {
        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%d  ", 8 - i);

            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j] != null) {
                    System.out.printf("%s%c%s ", board[i][j].getColor().getStringColor(), board[i][j].getLetter(), ANSI_RESET);
                } else if (validMoves[i][j]) {
                    System.out.printf("%s#%s ", RED, ANSI_RESET);
                } else {
                    System.out.print("· ");
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < WIDTH; i++) {
            System.out.printf(" %s", Character.toString(97 + i));
        }
        System.out.println();
    }

    public static Position TransformInput(String input) {
        int col = input.charAt(0) - 97;
        int row = Integer.parseInt(String.valueOf(input.charAt(1))) - 1;

        row = Math.abs(row - 7);

        return new Position(row, col);
    }
}
