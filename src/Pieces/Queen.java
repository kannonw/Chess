package Pieces;

public class Queen extends Piece{
    public Queen(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves() {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        char letter = 'Q';
        return letter;
    }
}
