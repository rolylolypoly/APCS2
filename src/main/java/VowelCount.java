import java.util.Arrays;

/**
 * Author: Will Dang
 * 11/4/2015.
 */
public class VowelCount {
    public static void count(String string) {
        int i = 1;
        int arrayIndex = 0;
        char[] potato = new char[string.length()];
        for (char ch: string.toLowerCase().toCharArray()) {
            ch -= 96;
            if (Arrays.asList(1, 5, 9, 15, 21, 25).contains((int) ch)) {
                ch = ((char) i);
                arrayIndex ++;
                potato[(arrayIndex-1)] = (char) (ch + 47);
                i++;
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
