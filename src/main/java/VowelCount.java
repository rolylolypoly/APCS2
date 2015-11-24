import java.util.Arrays;

/**
 * Author: Will Dang
 * 11/4/2015.
 */
public class VowelCount {
    public static void count(String string) {
        int vowel = 1;
        int arrayIndex = 0;
        char[] potato = new char[string.length()];
        for (char ch: string.toLowerCase().toCharArray()) {
            ch -= 96;
            if (Arrays.asList(1, 5, 9, 15, 21, 25).contains((int) ch)) {
                ch = ((char) vowel);
                potato[(arrayIndex)] = (char) (ch + 47);
                arrayIndex ++;
                vowel++;
            }
            else {
                ch += 96;
                potato[(arrayIndex)] = ch;
                arrayIndex++;
            }
        }

        System.out.println(potato);
    }

}
