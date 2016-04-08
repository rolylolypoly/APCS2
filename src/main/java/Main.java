import Matrices.Struble;

import java.util.Arrays;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        int[][] A = {
                {-1, 5, 9},
                {8, 0, 0},
                {5, 0, 1}
        };
        int[][] B = {
                {-2},{4},{11}
        };
        System.out.println(Arrays.deepToString(Struble.product(A, B)));
    }
}
