package OldMacDonald;

/**
 * Created by rolypoly on 2/12/16.
 */
public class Pig implements Animal {
    private String myType;
    private String mySound;

    public Pig() {
        myType = "pig";
        mySound = "oink";
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
