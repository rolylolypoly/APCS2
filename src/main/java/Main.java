import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        VowelCount.count(string);
    }
}
