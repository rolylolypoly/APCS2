package OldMacDonald;

/**
 * Created by rolypoly on 2/12/16.
 */
public class NamedCow extends Cow {
    private String name;

    NamedCow(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }
}
