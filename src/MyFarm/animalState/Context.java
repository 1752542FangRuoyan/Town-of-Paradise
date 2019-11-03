package MyFarm.animalState;

public interface Context {
    // 时间流逝
    void timeChange(int currentTime);
    // 喂食
    void getFed(int currentTime);
}
