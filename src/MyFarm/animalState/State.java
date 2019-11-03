package MyFarm.animalState;

import MyFarm.creature.Creature;

import java.io.Serializable;

public interface State extends Serializable {
    void getFull(Context context);  // 吃饱了
    void getHungry(Context context);  // 饿了
    void gainExperience(Creature bc);  //获取经验值
}
