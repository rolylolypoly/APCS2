import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Dimmies: ");
        double dim1 = in.nextDouble();
        double dim2 = in.nextDouble();
        double dim3 = in.nextDouble();
        double weight = in.nextDouble();
        PostOffice.Calculate(dim1, dim2, dim3, weight);
        PostOffice.Calculate(3.0, 2.0, 1.0, 1.0);
        PostOffice.Calculate(3.0, 2.0, 3.0, 1.0);
        PostOffice.Calculate(3.0,3.0,3.0,1.0);
    }
}
