package MyFarm.animals;

import MyFarm.animalState.FullState;
import MyFarm.creature.Creature;

public class Pig extends BaseAnimal {

    public Pig() {

        this.isSaled = false;
        this.isMature = false;
        this.appetite = 5;
        this.value = 1;
        this.name = "Pig";
        //System.out.println("新生成了一只猪");
    }
    public double cost() {
        return this.value;
    }


    public Creature clone() {
        return new Pig();
    }
    public String getName() {
        return this.name;
    }

    public void timeChange(int currentTime) {
        if(lastSupplyTime > currentTime) {
            if(currentTime + 24 -lastSupplyTime > 5) {
                // 猫饿了
                state.getHungry(this);
            }
            else {
                state.gainExperience(this);
            }
        }
        else {
            if(currentTime - lastSupplyTime > 5) {
                // 猫饿了
                state.getHungry(this);
                System.out.println("Pig becomes hungry");
            }
            else {
                state.gainExperience(this);
            }
        }
        if(this.experience >= 144){
            this.isMature = true;
        }
    }


    // 喂食重写-猫
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    public void tick(){

    }
}
