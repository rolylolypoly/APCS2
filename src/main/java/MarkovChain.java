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

        float f = (float) Math.random();
        for (element e: elements) {
            for (element ee: elements) {
                if (!(e.equals(ee))) e.relationships.put(ee, new stats(f, elements.size() - f)); //Well shit. e1 + e2 ... = 1. GENETIC RECURSIVE AL GORE RHYTHMZ.
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
