import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println("Text: ");
        String s = in.nextLine();
        CasesarCipher.Shift(s, n);
    }
}
