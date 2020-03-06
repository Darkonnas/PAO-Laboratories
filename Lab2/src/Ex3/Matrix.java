package Ex3;

import org.jetbrains.annotations.NotNull;

import java.security.InvalidParameterException;
import java.util.Arrays;

class Matrix {
    private int[][] matrix;
    private int lineCount;
    private int columnCount;
    
    public Matrix(@NotNull final int[][] matrix) throws InvalidParameterException {
        lineCount = matrix.length;
        columnCount = matrix[0].length;
        for (int[] line : matrix) {
            if (line.length != columnCount) {
                throw new InvalidParameterException("Matrix has lines with different number of elements!");
            }
        }
        this.matrix = Arrays.copyOf(matrix, lineCount);
    }
    
    public Matrix() {
        this(new int[1][1]);
    }
    
    public Matrix add(@NotNull final Matrix Obj) throws InvalidParameterException {
        if (lineCount != Obj.lineCount || columnCount != Obj.columnCount) {
            throw new InvalidParameterException("Matrices have different dimensions!");
        }
        Matrix Result = new Matrix(matrix);
        for (int i = 0; i < lineCount; ++i) {
            for (int j = 0; j < columnCount; ++j) {
                Result.matrix[i][j] += Obj.matrix[i][j];
            }
        }
        return Result;
    }
    
    public Matrix multiply(@NotNull final Matrix Obj) throws InvalidParameterException {
        if (columnCount != Obj.lineCount) {
            throw new InvalidParameterException("First matrix' second dimension differs for the second matrix first' dimension!");
        }
        Matrix Result = new Matrix(new int[lineCount][Obj.columnCount]);
        for (int i = 0; i < lineCount; ++i) {
            for (int j = 0; j < Obj.columnCount; ++j) {
                for (int k = 0; k < columnCount; ++k) {
                    Result.matrix[i][j] += matrix[i][k] + Obj.matrix[k][j];
                }
            }
        }
        return Result;
    }
    
    public Matrix pow(int power) {
        Matrix Result = new Matrix(matrix);
        if (power == 0) {
            for (int i = 0; i < lineCount; ++i) {
                for (int j = 0; j < columnCount; ++j) {
                    matrix[i][j] = (i == j) ? 1 : 0;
                }
            }
        } else {
            for (int i = 0; i < power; ++i) {
                Result = Result.multiply(this);
            }
        }
        return Result;
    }
    
    @Override
    public String toString() {
        StringBuilder asString = new StringBuilder(5 * lineCount * columnCount + lineCount + 32);
        asString.append("Matrix{\n\tLines: ").append(lineCount).append("\n\tColumns: ").append(columnCount).append("\n\tMatrix:\n");
        for (int i = 0; i < lineCount; ++i) {
            asString.append("\t\t");
            for (int j = 0; j < columnCount; ++j) {
                asString.append(matrix[i][j]);
                if (j < columnCount - 1) {
                    asString.append(' ');
                }
            }
            asString.append('\n');
        }
        asString.append('}');
        return asString.toString();
    }
}
