package Runtime;

import Pieces.Position;

import java.util.Scanner;

public class Main {

    private static Scanner Scan = new Scanner(System.in);
    private static Game Game = new Game();

    public static void main(String[] args) {
        try {
            while (true) {
                try {
                    Round();
                }
                catch (ChessException e) {
                    System.out.printf("Warning: %s\n", e.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Round() throws ChessException {
        boolean[][] valid_moves;
        Position move, move_to;

        Screen.UpdateBoard(Game.getBoard());

        System.out.print("\nMove: ");
        move = Screen.TransformInput(Scan.next());
        valid_moves = Game.GetValidMoves(move);

        Screen.UpdateBoard(Game.getBoard(), valid_moves);

        System.out.print("\nMove to: ");
        move_to = Screen.TransformInput(Scan.next());

        Game.MovePiece(move, move_to);
    }
}