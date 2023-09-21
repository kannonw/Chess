package Pieces;
import Runtime.*;

public class Pawn extends Piece {

    public Pawn(Game game, PieceColor color) {
        super(game, color);
    }

    @Override
    public boolean[][] PossibleMoves(Position pos) {
        boolean[][] validMoves = new boolean[Screen.HEIGHT][Screen.WIDTH];
        Piece[][] board = Game.getBoard();
        Piece pawn = board[pos.Row][pos.Col];

        int direction, new_row;

        if (pawn.getColor() == PieceColor.WHITE)
            direction = -1;
        else
            direction = 1;

        new_row = pos.Row + direction;

        if (0 < new_row && new_row < 7 && board[new_row][pos.Col] == null)
            validMoves[new_row][pos.Col] = true;

        if (0 < new_row + direction && new_row + direction < 7 && board[new_row][pos.Col] == null && board[new_row + direction][pos.Col] == null && FirstMove)
            validMoves[new_row + direction][pos.Col] = true;

        if (0 < new_row && new_row < 7 && pos.Col < 7 && board[new_row][pos.Col + 1] != null && board[new_row][pos.Col + 1].getColor() != pawn.getColor()) {
            validMoves[new_row][pos.Col + 1] = true;
        }
        if (0 < new_row && new_row < 7 && 0 < pos.Col && board[new_row][pos.Col - 1] != null && board[new_row][pos.Col - 1].getColor() != pawn.getColor()) {
            validMoves[new_row][pos.Col - 1] = true;
        }

        return validMoves;
    }

    @Override
    public int[][] AttackedSquares(Position pos) {
        Piece[][] board = Game.getBoard();
        int[][] allAttackedSquares;
        int direction, new_row;


        if (this.getColor() == PieceColor.WHITE) {
            allAttackedSquares = Game.WhiteAttackedSquares;
            direction = -1;
        } else {
            allAttackedSquares = Game.BlackAttackedSquares;
            direction = 1;
        }


        new_row = pos.Row + direction;

        if (0 < new_row && new_row < 7 && pos.Col < 7 && board[new_row][pos.Col + 1] != null && board[new_row][pos.Col + 1].getColor() != this.getColor()) {
            allAttackedSquares[new_row][pos.Col + 1] += 1;
        }
        if (0 < new_row && new_row < 7 && 0 < pos.Col && board[new_row][pos.Col - 1] != null && board[new_row][pos.Col - 1].getColor() != this.getColor()) {
            allAttackedSquares[new_row][pos.Col - 1] += 1;
        }

        return allAttackedSquares;
    }

    @Override
    public int[][] RemoveAttackedSquares(Position pos) {
        Piece[][] board = Game.getBoard();
        int[][] allAttackedSquares;
        int direction, new_row;


        if (this.getColor() == PieceColor.WHITE) {
            allAttackedSquares = Game.WhiteAttackedSquares;
            direction = -1;
        } else {
            allAttackedSquares = Game.BlackAttackedSquares;
            direction = 1;
        }


        new_row = pos.Row + direction;

        if (0 < new_row && new_row < 7 && pos.Col < 7 && board[new_row][pos.Col + 1] != null && board[new_row][pos.Col + 1].getColor() != this.getColor()) {
            allAttackedSquares[new_row][pos.Col + 1] -= 1;
        }
        if (0 < new_row && new_row < 7 && 0 < pos.Col && board[new_row][pos.Col - 1] != null && board[new_row][pos.Col - 1].getColor() != this.getColor()) {
            allAttackedSquares[new_row][pos.Col - 1] -= 1;
        }

        return allAttackedSquares;
    }

    @Override
    public char getLetter () {
        return 'P';
    }
}
