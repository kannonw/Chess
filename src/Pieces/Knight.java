package Pieces;

public class Knight extends Piece{

    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves() {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        char letter = 'N';
        return letter;
    }
}
