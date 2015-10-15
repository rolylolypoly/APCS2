import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/15/2015.
 */
public class CasesarCipher {
    private static char[] alphabet = new char[26];
    private static char[] input;
    public static char[] output;

    static {
        for (int i = 97; i <= 122; i++)
            alphabet[i - 97] = (char) i;
    }

    public static void Shift(int shift) {
        Scanner input = new Scanner(System.in);
        System.out.println(alphabet);
    }
}
