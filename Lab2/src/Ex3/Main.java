package Ex3;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {2, 1, 3}, {3, 3, 1}};
        Matrix myMatrix = new Matrix(matrix);
        System.out.println(myMatrix);
    }
}
