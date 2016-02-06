import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Will on 2/5/2016.
 */
public class MarkovChain {
    ArrayList<element> elements = new ArrayList<>();
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
        stats(float r, float o) {
            recursion = r;
            other = o;
        }
    }
    void init() {
        for (int i = 0; i < (Math.random() * 100); i++) {
            elements.add(new element(i));
        }

        float i = (float) Math.random();
        for (element e: elements) {
            for (element ee: elements) {
                e.relationships.put(ee, new stats(i, 1 - i));
            }
        }
    }
    public String toString() {
        String s = "";
        for (element e: elements) {
            s += (Integer.toString(e.uuid));
            s += "\n";
            s += e.relationships.toString();
            s += "\n";
        }
        return s;

    }
}
