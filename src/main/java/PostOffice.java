import java.util.Arrays;

import static java.lang.System.*;
/**
 * Author: Will Dang
 * 10/20/2015.
 */
public class PostOffice {
    public static void Calculate(double dim1, double dim2, double dim3, double weight) {
        //double[] yes = new double[3];
        //yes[0] = dim1;
        //yes[1] = dim2;
        //yes[2] = dim3;
        //Arrays.sort(yes);
        //for (int i = 0; i <= 2; i++) {
        //    System.out.println(yes[i]);
        //}
        //double girth = yes[2] * yes[1];
        //double lengthgirth = yes[0] + girth;

        double girth;
        double lengthgirth;
        if (dim1 > dim2 && dim2 > dim3) {
            girth = (2 * dim1) + (2 * dim2);
            lengthgirth = dim1 + girth;
        }
        else if (dim2 > dim1 && dim1 > dim3) {
            girth = (2 * dim2) + (2 * dim1);
            lengthgirth = dim2 + girth;
        }
        else if (dim3 > dim1 && dim1 > dim2) {
            girth = (2 * dim3) + (2 * dim1);
            lengthgirth = dim3 + girth;
        }
        else if (dim1 > dim2 && dim2 == dim3) {
            girth = (2 * dim1) + (2 * dim3);
            lengthgirth = dim1 + girth;
        }
        else if (dim2 > dim1 && dim1 == dim3) {
            girth = (2 * dim2) + (2 * dim3);
            lengthgirth = dim2 + girth;
        }
        else if (dim3 > dim1 && dim1 == dim2) {
            girth = (2 * dim3) + (2 * dim2);
            lengthgirth = dim3 + girth;
        }
        else if (dim1 == dim2 && dim1 > dim3) {
            girth = (2 * dim1) + (2 * dim2);
            lengthgirth = dim3 + girth;
        }
        else if (dim1 == dim3 && dim1 > dim2) {
            girth = (2 * dim1) + (2 * dim3);
            lengthgirth = dim3 + girth;
        }
        else if (dim3 == dim2 && dim2 > dim1) {
            girth = (2 * dim3) + (2 * dim2);
            lengthgirth = dim3 + girth;
        }
        else {
            girth = (2 * dim1) + (2 * dim2);
            lengthgirth = dim1 + girth;
            out.println("Cube. Or something. CHECK LOGIC.");
        }

        out.println(girth);
        out.println(lengthgirth);
        if (lengthgirth < 100.0 & weight < 70) out.println("Can ship.");
        else out.println("Nope.");

    }
}
