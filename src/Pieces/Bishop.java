package Pieces;
import Runtime.*;

public class Bishop extends Piece {

    public Bishop(Game game, PieceColor color) {
        super(game, color);
    }

    @Override
    public boolean[][] PossibleMoves(Position pos) {
        boolean[][] validMoves = new boolean[Screen.HEIGHT][Screen.WIDTH];
        Piece[][]board = Game.getBoard();


        for (int i = 1; pos.Col + i < Screen.WIDTH && pos.Row + i < Screen.HEIGHT; i++) {
            Piece piece = board[pos.Row+i][pos.Col+i];

            if (piece == null) {
                validMoves[pos.Row+i][pos.Col+i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row+i][pos.Col+i] = true;
                break;
            } else {
                break;
            }
        }

        for (int i = 1; pos.Row - i >= 0 && pos.Col + i < Screen.WIDTH; i++) {
            Piece piece = board[pos.Row-i][pos.Col+i];

            if (piece == null) {
                validMoves[pos.Row-i][pos.Col+i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row-i][pos.Col+i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; pos.Row + i < Screen.HEIGHT && pos.Col - i >= 0; i++) {
            Piece piece = board[pos.Row+i][pos.Col-i];

            if (piece == null) {
                validMoves[pos.Row+i][pos.Col-i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row+i][pos.Col-i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; pos.Row - i >= 0 && pos.Col - i >= 0; i++) {
            Piece piece = board[pos.Row-i][pos.Col-i];

            if (piece == null) {
                validMoves[pos.Row-i][pos.Col-i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row-i][pos.Col-i] = true;
            } else {
                break;
            }
        }

        return validMoves;
    }


    @Override
    public char getLetter() {
        return 'B';
    }
}
