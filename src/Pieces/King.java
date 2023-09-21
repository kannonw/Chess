package Pieces;
import Runtime.*;

public class King extends Piece{

    public King(Game game, PieceColor color) {
        super(game, color);
    }

    @Override
    public boolean[][] PossibleMoves(Position pos) {
        boolean[][] validMoves = new boolean[Screen.HEIGHT][Screen.WIDTH];
        Piece[][]board = Game.getBoard();

        int[][] allAttackedSquares;

        if (this.getColor() == PieceColor.WHITE)
            allAttackedSquares = Game.BlackAttackedSquares;
        else
            allAttackedSquares = Game.WhiteAttackedSquares;


        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if ((board[pos.Row + i][pos.Col + j] == null || board[pos.Row + i][pos.Col + j].getColor() != this.getColor()) && allAttackedSquares[pos.Row + i][pos.Col + j] == 0)
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
