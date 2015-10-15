import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/15/2015.
 */
public class MonthsYears {
    static Scanner scanner = new Scanner(System.in);
    public static void Convert() {
        int input = scanner.nextInt();
        int year = input / 12;
        int month = input % 12;
        System.out.println(year + " years");
        System.out.println(month + " months");
    }
}
