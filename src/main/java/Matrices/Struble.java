package Matrices;

/**
 * Created by rolypoly on 2/29/16.
 */
public class Struble {
    int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {6, 7, 1, 2, 5},
            {6, 7, 8, 9, 0},
            {5, 4, 3, 2, 1}
    };

    Struble(int[][] mat) {
        this.mat = mat;
    }

    Struble() {

    }

    public int cellSum(int[][] mat, int row, int col) {
        int sum = 0;
        for (int r = row - 1; r <= r + 1; r++) {
            for (int c = col - 1; c <= col + 1; r++) {
                sum += mat[r][c];
            }
        }
        return sum;
    }

    public int[][] sum(int[][] add) {
        for (int i = 0; i < add.length; i++) {
            for (int e : add[i]) {
                mat[i][e] += add[i][e];
            }
        }

        return mat;
    }
}
