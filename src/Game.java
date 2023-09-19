import Pieces.Piece;

public class Game {
    private Piece[][] board = new Piece[Screen.Height][Screen.Width];

    public Piece[][] getBoard() {
        return board;
    }

    public Game() {
        board = InstanceBoard.InstancePieces(board);
    }


    public boolean MoveIsValid() {
        return true;
    }

    public boolean[][] GetValidMoves(Position pos) throws ChessException {
        if (GetPiece(pos) != null) throw new ChessException("Position is empty.");
        return GetPiece(pos).PossibleMoves();
    }

    public void MovePiece(Position pos, Position final_pos) {
    }

    public Piece GetPiece(Position pos) {
        return board[pos.Row][pos.Col];
    }
}
