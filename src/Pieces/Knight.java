package Pieces;

public class Knight extends Piece{

    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves(Piece[][] board, Position pos) {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        return 'N';
    }
}