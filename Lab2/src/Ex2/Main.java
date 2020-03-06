package Ex2;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static boolean checkSymmetry(@NotNull final int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {2, 1, 3}, {3, 3, 1}};
        if (checkSymmetry(matrix)) {
            System.out.println("Matrix is symmetric!");
        } else {
            System.out.println("Matrix is not symmetric!");
        }
    }
}
