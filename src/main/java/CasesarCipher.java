import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/15/2015.
 */
public class CasesarCipher {
    public static void Cipher(int shift) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Shift(line, shift);
    }

    private static void Shift(String line, int shift) {
        line = line.toLowerCase();
        char[] output = new char[line.length()];
        int i = 0;
        for (char ch : line.toCharArray()) {
            if (ch >= 97 && ch <= 122) {
                output[i] = (char) (((ch - 97 + shift) % 26) + 97);
            } else {
                output[i] = ch;
            }
            i++;
        }
        String outString = new String(output);
        System.out.println(outString);
        System.out.println("n = " + shift);
    }
}
