/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        //(new Thread(new Client())).start();
        int[] kek = new int[128];
        int[] no = new int[10];
        for (int n: kek) {
            kek[n] = ((int)(Math.random() * 10));
        }
        for (int n: kek) {
            no[kek[n]]++;
        }
        int bigboy = 0;
        for (int n: no) {
            if (no[n] > bigboy) bigboy = no[n];
        }
        System.out.println(kek);
        System.out.println(no);
        System.out.println(bigboy);
    }
}
