package Pieces;

public abstract class Piece {
    protected PieceColor Color;
    protected boolean FirstMove = true;

    public Piece(PieceColor color) {
        this.Color = color;
    }

    public void FirstMoveDone() {
        FirstMove = false;
    }

    public abstract boolean[][] PossibleMoves(Piece[][] board, Position pos);

    public abstract char getLetter();

    public PieceColor getColor() {
        return Color;
    }
}

