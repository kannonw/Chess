package Pieces;
import Runtime.*;

public abstract class Piece {
    protected Game Game;
    protected PieceColor Color;
    protected boolean FirstMove = true;


    public Piece(Game game, PieceColor color) {
        this.Game = game;
        this.Color = color;
    }

    public int[][] AttackedSquares(Position pos) {
        int[][] allAttackedSquares;

        if (this.getColor() == PieceColor.WHITE)
            allAttackedSquares = Game.WhiteAttackedSquares;
        else
            allAttackedSquares = Game.BlackAttackedSquares;

        boolean[][] bool = PossibleMoves(pos);

        for (int i = 0; i < Screen.HEIGHT; i++) {
            for (int j = 0; j < Screen.WIDTH; j++) {
                if (bool[i][j]) {
                    allAttackedSquares[i][j] += 1;
                }
            }
        }

        return allAttackedSquares;
    }

    public int[][] RemoveAttackedSquares(Position pos) {
        int[][] allAttackedSquares;

        if (this.getColor() == PieceColor.WHITE)
            allAttackedSquares = Game.WhiteAttackedSquares;
        else
            allAttackedSquares = Game.BlackAttackedSquares;

        boolean[][] bool = PossibleMoves(pos);

        for (int i = 0; i < Screen.HEIGHT; i++) {
            for (int j = 0; j < Screen.WIDTH; j++) {
                if (bool[i][j]) {
                    allAttackedSquares[i][j] -= 1;
                }
            }
        }

        return allAttackedSquares;
    }

    public void FirstMoveDone() {
        FirstMove = false;
    }

    public PieceColor getColor() {
        return Color;
    }

    public boolean isFirstMove() {
        return FirstMove;
    }

    public abstract boolean[][] PossibleMoves(Position pos);

    public abstract char getLetter();
}

