package MyFarm.creature;

import MyFarm.animals.Dog;
import MyFarm.animals.Pig;
import MyFarm.plants.Crop;

public class CreatureModule {
    private static CreaturePrototype[] prototypes = new CreaturePrototype[3];
    private static int total = 0;

    public static void addPrototype(CreaturePrototype pro) {
        prototypes[total++] = pro;
    }

    public static Creature MyClone(String name) {
        for (int i=0; i<total; i++) {
            if (prototypes[i].getName().equals(name)) {
                return prototypes[i].clone();
            }
        }
        System.out.println(name + " not found");
        return null;
    }

    public static void initializePrototype() {
        CreatureModule.addPrototype(new Pig());
        CreatureModule.addPrototype(new Dog());
        CreatureModule.addPrototype(new Crop());
    }
}
