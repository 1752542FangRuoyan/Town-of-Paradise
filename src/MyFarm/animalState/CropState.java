package MyFarm.animalState;

import MyFarm.creature.Creature;

public class CropState implements State {
    private static CropState singleton = new CropState();
    private CropState() {}
    public static State getInstance() { return singleton; }
    public void getHungry(Context context) {}
    public void getFull(Context context) {}
    public void gainExperience(Creature plant) { plant.experience++; }
}
