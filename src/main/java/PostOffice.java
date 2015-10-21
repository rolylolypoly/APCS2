/**
 * Author: Will Dang
 * 10/20/2015.
 */
public class PostOffice {
    public static void Calculate(double dim1, double dim2, double dim3, double weight) {
        //double[] yes = new double[2];
        //yes[0] = dim1;
        //yes[1] = dim2;
        //yes[3] = dim3;
        double girth;
        double lengthgirth;
        if (dim1 > dim2 & dim2 > dim3) {
            girth = dim2 * dim3;
            lengthgirth = dim1 + girth;
        }
        else if (dim2 > dim1 & dim2 > dim3) {
            girth = dim1 * dim3;
            lengthgirth = dim2 + girth;
        }
        else if (dim3 > dim1 & dim3 > dim2) {
            girth = dim1 * dim2;
            lengthgirth = dim3 + girth;
        }
        else if (dim1 > dim2 & dim2 == dim3) {
            girth = dim2 * dim3;
            lengthgirth = dim1 + girth;
        }
        else if (dim2 > dim1 & dim1 == dim3) {
            girth = dim1 * dim3;
            lengthgirth = dim2 + girth;
        }
        else if (dim3 > dim1 & dim1 == dim2) {
            girth = dim1 * dim2;
            lengthgirth = dim3 + girth;
        }
        else {
            girth = dim1 * dim2;
            lengthgirth = dim1 + girth;
            System.out.println("Cube. Or something. CHECK LOGIC.");
        }
        System.out.println(girth);
        System.out.println(lengthgirth);
        if (lengthgirth < 100.0 & weight < 70) System.out.println("Can ship.");
        else System.out.println("Nope.");
    }
}
