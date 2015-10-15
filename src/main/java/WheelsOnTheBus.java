import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/14/2015.
 */
public class WheelsOnTheBus {
    static Scanner scanner = new Scanner(System.in);
    public static void Honk() {
        int bus, people, leftover, van;

        System.out.println("Please enter the number of students:");

        people = scanner.nextInt();
        bus = people / 60;
        leftover = people % 60;
        van = leftover / 15;

        if (leftover % 15 >= 1 ) van++;

        System.out.println(bus + "\n" + van);
    }
}
