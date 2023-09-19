package Pieces;

public class Pawn extends Piece{

    public Pawn(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves(Piece[][] board, Position pos) {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        return 'P';
    }
}
