/**
 * Created by rolypoly on 11/3/15.
 */
public class CoolNumber {
    public static void is(int potato){
        int count = 0;
        for (int i = 6; i < potato; i++) {
            if(isCoolNumber(i)) count ++;
        }
        System.out.println(count);
    }
    public static boolean isCoolNumber(int i) {
        if(i % 6 == 1 && i % 5 == 1 && i % 4 == 1) return true;
        else return false;
    }
}
