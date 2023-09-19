package Pieces;
import java.awt.*;

public abstract class Piece {
    protected PieceColor Color;

    public Piece(PieceColor color) {
        this.Color = color;
    }

    public abstract boolean[][] PossibleMoves(Piece[][] board, Position pos);

    public abstract char getLetter();

    public PieceColor getColor() {
        return Color;
    }
}

