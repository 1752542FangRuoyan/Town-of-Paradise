package MyFarm.animalState;

import MyFarm.creature.Creature;

public class HungryState implements State {
    private static HungryState singleton = new HungryState();
    private HungryState() {}
    public static State getInstance() { return singleton; }
    public void getFull(Context context) {}
    public void getHungry(Context context) {}
    public void gainExperience(Creature animal) {}
}
