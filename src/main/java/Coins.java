/**
 * Author: Will Dang
 * 10/20/2015.
 */
public class Coins {
    public static void yes(int cents, int dollars) {

        int fiddy = dollars / 50;
        dollars %= 25;
        int twenties = dollars / 20;
        dollars %= 20;
        int ten = dollars / 10;
        dollars %= 10;
        int fives = dollars / 5;
        dollars %= 5;

        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;
        System.out.println("Fiftie(s): " + fiddy);
        System.out.println("Ten(s): " + ten);
        System.out.println("Twentie(s): " + twenties);
        System.out.println("Five(s): " + fives);
        System.out.println("Dollar(s): " + dollars);
        System.out.println("Quarter(s): " + quarters);
        System.out.println("Dime(s): " + dimes);
        System.out.println("Nickel(s): " + nickels);
        System.out.println("Cent(s): " + cents);

    }
}
