package Pieces;
import Runtime.*;

public class Knight extends Piece{

    public Knight(Game game, PieceColor color) {
        super(game, color);
    }

    @Override
    public boolean[][] PossibleMoves(Position pos) {
        boolean[][] validMoves = new boolean[Screen.HEIGHT][Screen.WIDTH];
        Piece[][] board = Game.getBoard();


        if (pos.Row + 2 < Screen.HEIGHT) {
            if (pos.Col + 1 < Screen.WIDTH && (board[pos.Row + 2][pos.Col + 1] == null || board[pos.Row + 2][pos.Col + 1].getColor() != this.getColor()))
                validMoves[pos.Row + 2][pos.Col + 1] = true;
            if (pos.Col - 1 < Screen.WIDTH && (board[pos.Row + 2][pos.Col - 1] == null || board[pos.Row + 2][pos.Col - 1].getColor() != this.getColor()))
                validMoves[pos.Row + 2][pos.Col - 1] = true;
        }

        if (0 < pos.Row - 2) {
            if (pos.Col + 1 < Screen.WIDTH && (board[pos.Row - 2][pos.Col + 1] == null || board[pos.Row - 2][pos.Col + 1].getColor() != this.getColor()))
                validMoves[pos.Row - 2][pos.Col + 1] = true;
            if (pos.Col - 1 < Screen.WIDTH && (board[pos.Row - 2][pos.Col - 1] == null || board[pos.Row - 2][pos.Col - 1].getColor() != this.getColor()))
                validMoves[pos.Row - 2][pos.Col - 1] = true;
        }

        if (pos.Col + 2 < Screen.WIDTH) {
            if (pos.Row + 1 < Screen.HEIGHT && (board[pos.Row + 1][pos.Col + 2] == null || board[pos.Row + 1][pos.Col + 2].getColor() != this.getColor()))
                validMoves[pos.Row + 1][pos.Col + 2] = true;
            if (pos.Row - 1 < Screen.HEIGHT && (board[pos.Row - 1][pos.Col + 2] == null || board[pos.Row - 1][pos.Col + 2].getColor() != this.getColor()))
                validMoves[pos.Row - 1][pos.Col + 2] = true;
        }

        if (0 < pos.Col - 2) {
            if (pos.Row + 1 < Screen.HEIGHT && (board[pos.Row + 1][pos.Col - 2] == null || board[pos.Row + 1][pos.Col - 2].getColor() != this.getColor()))
                validMoves[pos.Row + 1][pos.Col - 2] = true;
            if (pos.Row - 1 < Screen.HEIGHT && (board[pos.Row - 1][pos.Col - 2] == null || board[pos.Row - 1][pos.Col - 2].getColor() != this.getColor()))
                validMoves[pos.Row - 1][pos.Col - 2] = true;
        }

        return validMoves;
    }

    @Override
    public char getLetter() {
        return 'N';
    }
}
