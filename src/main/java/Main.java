import java.util.ArrayList;
import java.util.HashMap;

/**
 * Author: Will Dang
 * 10/5/2015.
 */

public class Main {
    ArrayList<element> elements = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //(new Thread(new Client())).start();
    }
    private class element {
        int uuid;
        HashMap<element, stats> relationships = new HashMap<>();
        element (int u) {
            uuid = u;
        }
    }
    private class stats {
        float recursion;
        float other;
    }
    private class others {
        void getOthers(int i) {
            elements.get(i);
        }
    }
    private void init() {
        for (int i = 0; i < (Math.random() * 100); i++) {
            elements.add(new element(i));
        }
    }
}
