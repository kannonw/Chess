package Runtime;

import Pieces.Piece;
import Pieces.Position;

public class Game {
    private Piece[][] board = new Piece[Screen.HEIGHT][Screen.WIDTH];

    public Piece[][] getBoard() {
        return board;
    }

    public Game() {
        board = InstanceBoard.InstancePieces(board);
    }


    public boolean MoveIsValid(Position pos, Position final_pos) {
        return GetPiece(pos).PossibleMoves(board, pos)[final_pos.Row][final_pos.Col];
    }

    public boolean[][] GetValidMoves(Position pos) throws ChessException {
        if (GetPiece(pos) == null) throw new ChessException("Position is empty.");

        return GetPiece(pos).PossibleMoves(board, pos);
    }

    public void MovePiece(Position pos, Position final_pos) throws ChessException {
        if (!MoveIsValid(pos, final_pos)) throw new ChessException("This move is not allowed.");

        board[final_pos.Row][final_pos.Col] = GetPiece(pos);
        board[pos.Row][pos.Col] = null;
    }

    public Piece GetPiece(Position pos) {
        return board[pos.Row][pos.Col];
    }
}
