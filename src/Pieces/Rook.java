package Pieces;

public class Rook extends Piece{

    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves(Piece[][] board, Position pos) {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        return 'R';
    }

}
