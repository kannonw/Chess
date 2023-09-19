package Pieces;

public class Rook extends Piece{

    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves() {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        char letter = 'R';
        return letter;
    }

}
