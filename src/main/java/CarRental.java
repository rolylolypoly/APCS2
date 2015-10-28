/**
 * Author: Will Dang
 * 10/27/2015.
 */
public class CarRental {
    public static void fuck(String input) throws Exception {
        char one = input.charAt(0);
        char two = input.charAt(1);
        char three = input.charAt(2);
        int fuck = Integer.parseInt(input.substring(4, 7));
        int shit = one + two + three + fuck;
        char potato = (char) ((shit % 26) + 65);
        System.out.println(shit);
        System.out.println(potato);
        System.out.println(String.valueOf(potato)+String.valueOf(shit));
    }
}
