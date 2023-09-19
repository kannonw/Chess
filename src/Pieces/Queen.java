package Pieces;

public class Queen extends Piece{
    public Queen(PieceColor color) {
        super(color);
    }

    @Override
    public boolean[][] PossibleMoves(Piece[][] board, Position pos) {
        return new boolean[0][];
    }

    @Override
    public char getLetter() {
        return 'Q';
    }
}
