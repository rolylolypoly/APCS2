/**
 * Author: Will Dang
 * 11/3/2015.
 */
public class PrimeNumber {
    public void find(long dong) {
        System.out.println(0);
        while (true) {
            dong++;
            System.out.println(dong);
            for (int i1 = 1; i1 < dong; i1++) {
                if (dong % i1 == 0) {
                    System.out.println(1 + " : " + (dong / i1));

                }
            }
        }
    }
}
