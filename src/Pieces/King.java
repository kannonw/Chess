package Pieces;

public class King extends Piece{

    public King(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves(Piece[][] board, Position pos) {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        return 'K';
    }
}
