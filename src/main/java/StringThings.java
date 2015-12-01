/**
 * Created by rolypoly on 11/30/15.
 */
public class StringThings {
    /**
     * @param input String with two words separated by a space
     * @return      String without space
     */
    public static String conCats(String input) {
        int indexOfSpace = input.indexOf(' ');
        return (input.substring(0 , indexOfSpace) + input.substring(indexOfSpace + 1));
    }

    /**
     * @param one First String input
     * @param two Second String input
     * @return    Concatenated String of first then second input
     */
    public static String conCats(String one, String two) {
        return (one + two);
    }
}
