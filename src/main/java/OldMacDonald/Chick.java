package OldMacDonald;

/**
 * Created by rolypoly on 2/12/16.
 */
public class Chick implements Animal {
    private String myType;
    private String mySound;

    public Chick() {
        myType = "chick";
        mySound = "rawr";
    }

    @Override
    public String getSound() {
        return mySound;
    }

    @Override
    public String getType() {
        return myType;
    }
}
