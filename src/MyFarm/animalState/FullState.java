package MyFarm.animalState;

import MyFarm.creature.Creature;

import java.io.Serializable;

public class FullState implements State, Serializable {
    private static FullState singleton = new FullState();
    private FullState() {}
    public static State getInstance() { return singleton; }
    public void getFull(Context context) {}
    public void getHungry(Context context) {}
    public void gainExperience(Creature animal) {
        animal.experience++;  // 增长经验
    }
}
