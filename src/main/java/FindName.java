import java.util.Scanner;

/**
 * Created by rolypoly on 11/24/15.
 */
public class FindName {
    public static void find() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int indexOfPreviousHashtag = 0;
        int indexOfSpace = 0;
        for (int i = indexOfPreviousHashtag; i < string.length(); i+=indexOfPreviousHashtag) {
            indexOfPreviousHashtag = string.indexOf('#', indexOfSpace);
            indexOfSpace = string.indexOf(' ', indexOfPreviousHashtag);
            if (indexOfSpace == -1) indexOfSpace = string.length();
            System.out.println(string.substring(indexOfPreviousHashtag + 1, indexOfSpace));
        }
    }
}
