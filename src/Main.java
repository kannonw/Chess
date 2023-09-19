import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            Game game = new Game();
            Position move, move_to;
            boolean[][] valid_moves;

            while (true) {
                try {
                    Screen.UpdateBoard(game.getBoard());

                    move = Screen.TransformInput(scan.next());
                    valid_moves = game.GetValidMoves(move);

                    Screen.UpdateBoard(game.getBoard(), valid_moves);
                }
                catch (ChessException e) {
                    System.out.println(e);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}