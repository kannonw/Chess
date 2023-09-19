package Pieces;

public class Bishop extends Piece {

    public Bishop(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves() {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        char letter = 'B';
        return letter;
    }
}
