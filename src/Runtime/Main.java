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
                    Round("White");
                    Round("Black");
                }
                catch (ChessException e) {
                    System.out.printf("Warning: %s\n", e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void Round(String color) throws ChessException {
        boolean[][] valid_moves;
        Position move, move_to;

        Screen.UpdateBoard(Game.getBoard());

        System.out.printf("%s - Move: ", color);
        move = Screen.TransformInput(Scan.next());
        valid_moves = Game.GetValidMoves(move);

        Screen.UpdateBoard(Game.getBoard(), valid_moves);

        System.out.printf("%s - Move to: ", color);
        move_to = Screen.TransformInput(Scan.next());
    }
}