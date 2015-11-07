import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int in1 = input.nextInt();
        int in2 = input.nextInt();
        System.out.println(LCM.calculate(in1,in2));
    }
}
