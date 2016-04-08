package Matrices;

/**
 * Created by rolypoly on 2/29/16.
 */
public class Struble {
    private int[][] mat = {
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

    public static int[][] product(int[][] A, int [][] B) {
        int Ay = A[0].length;
        int Ax = A.length;
        int By = B[0].length;
        int Bx = B.length;
        int x;
        int y;
        if (Ay == Bx){
            x = Ax;
            y = By;
            System.out.println(x + " x " + y);
        }
        else {
            System.err.println("Undefined");
            return A;
        }
        int[][] product = new int[x][y];
        for (int k = 0; k < Bx; k++) {
            for (int i = 0; i < By; i++) {
                for (int l = 0; l < Ax; l++) {
                    for (int j = 0; j < Ay; j++) {
                        product[j][l] += (A[j][l] * B[i][k]);
                    }
                }
            }
        }
        return product;
    }
}
