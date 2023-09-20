package Runtime;

import Pieces.Piece;
import Pieces.PieceColor;
import Pieces.Position;

public class Game {
    private Piece[][] board = new Piece[Screen.HEIGHT][Screen.WIDTH];

    private boolean isBlackTurn;

    public Piece[][] getBoard() {
        return board;
    }

    public Game() {
        board = InstanceBoard.InstancePieces(board);
    }


    public boolean[][] GetValidMoves(Position pos) throws ChessException {
        Piece piece = GetPiece(pos);
        if (piece == null) throw new ChessException("Position is empty.");
        if (piece.getColor() == PieceColor.WHITE && isBlackTurn) throw  new ChessException("It's black turn.");
        if (piece.getColor() == PieceColor.BLACK && !isBlackTurn) throw  new ChessException("It's white turn.");

        return GetPiece(pos).PossibleMoves(board, pos);
    }

    public void MovePiece(Position pos, Position final_pos) throws ChessException {
        if (!MoveIsValid(pos, final_pos)) throw new ChessException("This move is not allowed.");

        isBlackTurn = !isBlackTurn;

        board[final_pos.Row][final_pos.Col] = GetPiece(pos);
        board[final_pos.Row][final_pos.Col].FirstMoveDone();

        board[pos.Row][pos.Col] = null;
    }

    public Piece GetPiece(Position pos) {
        return board[pos.Row][pos.Col];
    }

    private boolean MoveIsValid(Position pos, Position final_pos) {
        return GetPiece(pos).PossibleMoves(board, pos)[final_pos.Row][final_pos.Col];
    }
}
