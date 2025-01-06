package gr.aueb.cf.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project04 {

    static String[] board;
    static String turn;

    // Check all the board for any of the victory conditions.
    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = null;

            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            }

            else if (line.equals("OOO")) {
                return "O";
            }
        }

        // Check for draw. If at least one slot is a value between 1 and 9, there is still slots to play.
        boolean isDraw = true;
        for (int j = 0; j < 9; j++) {
            if (board[j].equals(String.valueOf(j + 1))) {
                isDraw = false; // At least one slot is still empty
                break;
            }
        }
        if (isDraw) {
            return "draw";
        }

        // Game is still ongoing
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    // Print the board.
    static void printBoard() {

        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");

        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");

        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to Coding Factory Tic-Tac-Toe!");
        printBoard();

        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (numInput < 1 || numInput > 9) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }

            // This game has two players: X and O.
            // Logic to decide the turn
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
            }
        }

        // Display the result
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + " has won! Thanks for playing.");
        }

        in.close();
    }
}





