package Pieces;

public class Pawn extends Piece{

    public Pawn(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves() {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        char letter = 'P';
        return letter;
    }
}
