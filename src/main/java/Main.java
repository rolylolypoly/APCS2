import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter in ABC 123 format: ");
        String input = in.nextLine();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        if (a < b && b < c) System.out.println(a);
        else if (a > b && b < c) System.out.println(b);
        else if (a > b && b > c) System.out.println(c);
        else if (a == b && b < c) System.out.println(a + ", " + b);
        else if (a > b && b == c) System.out.println(b + ", " + c);
        else if (a < b && a == c) System.out.println(a + ", " + c);
        else System.out.println(a + ", " + b + ", " + c);
        //char[] yes = input.toCharArray();
        //Arrays.sort(yes);
        //System.out.println(yes);
        //CarRental.fuck(input);
    }
}
