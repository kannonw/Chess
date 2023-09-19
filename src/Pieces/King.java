package Pieces;

public class King extends Piece{

    public King(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves() {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        char letter = 'K';
        return letter;
    }
}
