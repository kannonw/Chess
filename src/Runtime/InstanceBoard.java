package Runtime;

import Pieces.*;

public class InstanceBoard {

    public static Piece[][] InstancePieces(Piece[][] board) {
        board = InstaceWhitePieces(board);

        return InstaceBlackPieces(board);
    }


    private static Piece[][] InstaceWhitePieces(Piece[][] board) {
        board[0][0] = new Rook(PieceColor.BLACK);
        board[0][1] = new Knight(PieceColor.BLACK);
        board[0][2] = new Bishop(PieceColor.BLACK);
        board[0][3] = new Queen(PieceColor.BLACK);
        board[0][4] = new King(PieceColor.BLACK);
        board[0][5] = new Bishop(PieceColor.BLACK);
        board[0][6] = new Knight(PieceColor.BLACK);
        board[0][7] = new Rook(PieceColor.BLACK);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(PieceColor.BLACK);
        }

        return board;
    }

    private static Piece[][] InstaceBlackPieces(Piece[][] board) {
        board[7][0] = new Rook(PieceColor.WHITE);
        board[7][1] = new Knight(PieceColor.WHITE);
        board[7][2] = new Bishop(PieceColor.WHITE);
        board[7][3] = new Queen(PieceColor.WHITE);
        board[7][4] = new King(PieceColor.WHITE);
        board[7][5] = new Bishop(PieceColor.WHITE);
        board[7][6] = new Knight(PieceColor.WHITE);
        board[7][7] = new Rook(PieceColor.WHITE);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(PieceColor.WHITE);
        }

        return board;
    }
}
