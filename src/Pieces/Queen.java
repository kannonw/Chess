package Pieces;
import Runtime.*;


public class Queen extends Piece{
    public Queen(Game game, PieceColor color) {
        super(game, color);
    }

    @Override
    public boolean[][] PossibleMoves(Position pos) {
        boolean[][] validMoves = new boolean[Screen.HEIGHT][Screen.WIDTH];
        Piece[][] board = Game.getBoard();
        Piece piece;

        for (int i = 1; pos.Col + i < Screen.WIDTH && pos.Row + i < Screen.HEIGHT; i++) {
            piece = board[pos.Row+i][pos.Col+i];

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
            piece = board[pos.Row-i][pos.Col+i];

            if (piece == null) {
                validMoves[pos.Row-i][pos.Col+i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row-i][pos.Col+i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; pos.Row + i < Screen.HEIGHT && pos.Col - i >= 0; i++) {
            piece = board[pos.Row+i][pos.Col-i];

            if (piece == null) {
                validMoves[pos.Row+i][pos.Col-i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row+i][pos.Col-i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; pos.Row - i >= 0 && pos.Col - i >= 0; i++) {
            piece = board[pos.Row-i][pos.Col-i];

            if (piece == null) {
                validMoves[pos.Row-i][pos.Col-i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row-i][pos.Col-i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; i <= pos.Row; i++) {
            piece = board[pos.Row - i][pos.Col];

            if (piece == null) {
                validMoves[pos.Row - i][pos.Col] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row - i][pos.Col] = true;
                break;
            } else {
                break;
            }
        }

        for (int i = 1; i < Screen.HEIGHT - pos.Row; i++) {
            piece = board[pos.Row + i][pos.Col];

            if (piece == null) {
                validMoves[pos.Row + i][pos.Col] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row + i][pos.Col] = true;
                break;
            } else {
                break;
            }
        }

        for (int i = 1; i <= pos.Col; i++) {
            piece = board[pos.Row][pos.Col - i];

            if (piece == null) {
                validMoves[pos.Row][pos.Col - i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row][pos.Col - i] = true;
                break;
            } else {
                break;
            }
        }

        for (int i = 1; i < Screen.WIDTH - pos.Col; i++) {
            piece = board[pos.Row][pos.Col + i];

            if (piece == null) {
                validMoves[pos.Row][pos.Col + i] = true;
            } else if (piece.getColor() != this.getColor()) {
                validMoves[pos.Row][pos.Col + i] = true;
                break;
            } else {
                break;
            }
        }

        return validMoves;
    }

    @Override
    public char getLetter() {
        return 'Q';
    }
}
