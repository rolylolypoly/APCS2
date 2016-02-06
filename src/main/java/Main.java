/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        //(new Thread(new Client())).start();
        MarkovChain markov = new MarkovChain();
        markov.init();
        System.out.println(markov.toString());
    }

}
