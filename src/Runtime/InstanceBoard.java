package Runtime;

import Pieces.*;

public class InstanceBoard {

    public static void InstancePieces(Game game, Piece[][] board) {
        InstaceWhitePieces(game, board);
        InstaceBlackPieces(game, board);
    }


    private static void InstaceWhitePieces(Game game, Piece[][] board) {
        board[0][0] = new Rook(game, PieceColor.BLACK);
        board[0][1] = new Knight(game, PieceColor.BLACK);
        board[0][2] = new Bishop(game, PieceColor.BLACK);
        board[1][3] = new Queen(game, PieceColor.BLACK);
        board[0][4] = new King(game, PieceColor.BLACK);
        board[0][5] = new Bishop(game, PieceColor.BLACK);
        board[0][6] = new Knight(game, PieceColor.BLACK);
        board[0][7] = new Rook(game, PieceColor.BLACK);

//        for (int i = 0; i < 8; i++) {
//            board[1][i] = new Pawn(game, PieceColor.BLACK);
//        }
    }

    private static void InstaceBlackPieces(Game game, Piece[][] board) {
        board[7][0] = new Rook(game, PieceColor.WHITE);
        board[7][1] = new Knight(game, PieceColor.WHITE);
        board[7][2] = new Bishop(game, PieceColor.WHITE);
        board[7][3] = new Queen(game, PieceColor.WHITE);
        board[7][4] = new King(game, PieceColor.WHITE);
        board[7][5] = new Bishop(game, PieceColor.WHITE);
        board[7][6] = new Knight(game, PieceColor.WHITE);
        board[7][7] = new Rook(game, PieceColor.WHITE);

//        for (int i = 0; i < 8; i++) {
//            board[6][i] = new Pawn(game, PieceColor.WHITE);
//        }
    }
}
