/**
 * Created by Will on 11/6/2015.
 */
public class LCM {
    public static int calculate(int in1, int in2) {
        int gcf = 1;
        for (int i = 2; i < Math.max(in1, in2); i++) {
            if (in1 % i == 0  && in2 % i == 0 ) gcf = i;
        }
        return ((in1 / gcf) * (in2 / gcf)) * gcf;
    }
}
