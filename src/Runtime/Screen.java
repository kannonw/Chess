package Runtime;

import Pieces.Piece;
import Pieces.Position;

public class Screen {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    public static void UpdateBoard(Piece[][] board) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j] != null) {
                    System.out.printf("%c ", board[i][j].getLetter());
                } else {
                    System.out.print("· ");
                }
            }
            System.out.println();
        }
    }

    public static void UpdateBoard(Piece[][] board, boolean[][] validMoves) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j] != null) {
                    System.out.printf("%c ", board[i][j].getLetter());
                } else if (validMoves[i][j]) {
                    System.out.print("# ");
                } else {
                    System.out.print("· ");
                }
            }
            System.out.println();
        }
    }

    public static Position TransformInput(String input) {
        int row = input.charAt(0) - 97;
        int col = Integer.parseInt(String.valueOf(input.charAt(1))) - 1;

        System.out.println(row);
        System.out.println(col);

        return new Position(row, col);
    }
}
