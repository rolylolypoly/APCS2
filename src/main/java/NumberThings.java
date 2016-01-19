import java.util.ArrayList;

/**
 * Created by rolypoly on 1/12/16.
 */
public class NumberThings {
    public static ArrayList<Integer> find(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                list.add(n/i);
            }
        }
        list.add(1);
        return list;
    }
    public static double avg(ArrayList<Integer> list) {
        int average, overall = 0;
        for (Integer n: list) {
            overall += n;
        }
        average = overall / list.size();
        return average;
    }
}
