import Pieces.Piece;

public class Screen {
    public static final int Width = 8;
    public static final int Height = 8;

    public static void UpdateBoard(Piece[][] board) {
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
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
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                if (board[i][j] != null) {
                    System.out.printf("%c ", board[i][j].getLetter());
                } else if (validMoves[i][j]) {
                    System.out.print("+ ");
                } else {
                    System.out.print("· ");
                }
            }
            System.out.println();
        }
    }

    public static Position TransformInput(String input) {
        int x, y;

        x = input.charAt(0) - 97;
        y = Integer.parseInt(String.valueOf(input.charAt(1))) - 1;

        return new Position(x, y);
    }
}
