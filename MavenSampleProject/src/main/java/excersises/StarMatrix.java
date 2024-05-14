package excersises;

public class StarMatrix {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the matrix
        int cols = 5; // Number of columns in the matrix

        // Create a 2D array to store the star matrix
        char[][] starMatrix = new char[rows][cols];

        // Fill the matrix with stars
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                starMatrix[i][j] = '*';
            }
        }

        // Print the star matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(starMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
    }
}
