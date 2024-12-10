package gr.aueb.cf.ch6;

public class TwoDimArrayApp {

    public static void main(String[] args) {

        // Κατα γραμμες (2) και στυλες (3)
        int[][] grid = new int[2][3];

        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        // traverse
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println(grid[i][j]);
            }
        }

        for (int[] row : grid) {
            for (int el : row) {
                System.out.println(el);
            }
            System.out.println();
        }
    }
}
