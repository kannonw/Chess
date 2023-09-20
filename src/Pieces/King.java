package Pieces;
import Runtime.*;

public class King extends Piece{

    public King(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves(Piece[][] board, Position pos) {
        boolean[][] validMoves = new boolean[Screen.HEIGHT][Screen.WIDTH];
        Piece king = board[pos.Row][pos.Col];

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if (board[pos.Row + i][pos.Col + j] == null || board[pos.Row + i][pos.Col + j].getColor() != king.getColor())
                        validMoves[pos.Row + i][pos.Col + j] = true;
                } catch (Exception e) { }
            }
        }

        return validMoves;
    }

    @Override
    public char getLetter() {
        return 'K';
    }
}
