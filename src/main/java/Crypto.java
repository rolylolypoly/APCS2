import java.util.HashMap;
import java.util.Map;

/**
 * Author: Will Dang
 * 10/15/2015.
 */
public class Crypto {

    public static void rotN(String line, int shift) {
        line = line.toLowerCase();
        char[] output = new char[line.length()];
        int i = 0;
        for (char ch : line.toCharArray()) {
            output[i] = ch >= 97 && ch <= 122 ? (char) (((ch - 97 + shift) % 26) + 97) : ch;
            i++;
        }
        String outString = new String(output).toUpperCase();
        System.out.println(outString);
        System.out.println("n = " + shift);
    }

    /**
     * @param line Input string
     */
    public static void patternAnalyze(String line) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 65; i <= 90; i++) {
            alphabet.put((char) i, 0);
        }
        for (char ch : line.toUpperCase().toCharArray()) {
            if (alphabet.containsKey(ch)) alphabet.put(ch, alphabet.get(ch) + 1);
        }
        System.out.println(alphabet);
    }
}
