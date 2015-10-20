/**
 * Author: Will Dang
 * 10/20/2015.
 */
public class Coins {
    public static void yes(int cents) {
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(cents);


    }
}
