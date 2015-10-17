/**
 * Author: Will Dang
 * 10/15/2015.
 */
public class CasesarCipher {

    public static void Shift(String line, int shift) {
        line = line.toLowerCase();
        char[] output = new char[line.length()];
        int i = 0;
        for (char ch : line.toCharArray()) {
            output[i] = ch >= 97 && ch <= 122 ? (char) (((ch - 97 + shift) % 26) + 97) : ch;
            i++;
        }
        String outString = new String(output);
        System.out.println(outString);
        System.out.println("n = " + shift);
    }
}
