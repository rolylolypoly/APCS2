package OldMacDonald;

import java.util.ArrayList;

/**
 * Created by rolypoly on 2/12/16.
 */
public class Farm {
    private ArrayList<Animal> myFarm = new ArrayList<>();

    public Farm() {
        myFarm.add(new Cow());
        myFarm.add(new Chick());
        myFarm.add(new Pig());
        myFarm.add(new NamedCow("bob"));
    }

    public void animalSounds() {
        Animal temp;
        for (int i = 0; i < myFarm.size(); i++) {
            temp = myFarm.get(i);
            System.out.println(temp.getType() + " goes " + temp.getSound());
        }
        NamedCow named = (NamedCow) myFarm.get(3);
        System.out.println(named.name());
        System.out.println(named.getSound());
        System.out.println(myFarm.toString());
    }
}
