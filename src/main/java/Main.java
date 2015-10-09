import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Will Dang
 * 10/5/2015.
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)  {
        componematizer();
    }
    public static void fahrenheitToCelsius() {
        System.out.println("Fahrenheit : ");

        int Fahrenheit = 0;

        try {
            Fahrenheit = keyboard.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Not a number");
        }

        int Celsius =  (Fahrenheit - 32) * 5 / 9;
        System.out.println(Celsius + "C");
    }

    public static void gpaCalc() {

        System.out.println("Enter 6 grade points");
        System.out.println("First : ");
        double grade1 = keyboard.nextDouble();
        System.out.println("Second : ");
        double grade2 = keyboard.nextDouble();
        System.out.println("Third : ");
        double grade3 = keyboard.nextDouble();
        System.out.println("Fourth : ");
        double grade4 = keyboard.nextDouble();
        System.out.println("Fifth : ");
        double grade5 = keyboard.nextDouble();
        System.out.println("Sixth : ");
        double grade6 = keyboard.nextDouble();

        System.out.println("GPA: " + ((grade1 + grade2 + grade3 + grade4 + grade5 + grade6) / 6 ));

    }
    public static void componematizer() {
        System.out.println("Radius: ");
        double radius = keyboard.nextDouble();
        System.out.println("Angle in degrees: ");
        double theta = keyboard.nextDouble();
        System.out.println("X:" + (radius * Math.cos(Math.toRadians(theta))));
        System.out.println("Y:" + (radius * Math.sin(Math.toRadians(theta))));
    }
}
