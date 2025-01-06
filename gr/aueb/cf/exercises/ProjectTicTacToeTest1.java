package gr.aueb.cf.exercises;

public class ProjectTicTacToeTest1 {

    public static void main(String[] args) {

        int[][] gameBoard = new int[3][3];
        int boardNumber = 1;

        // Fill the board with numbers from 1 to 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = boardNumber++;
            }
        }

        // Print the board
        System.out.println("Welcome to the Coding Factory tick-tack-toe!");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
