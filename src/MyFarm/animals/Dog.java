package MyFarm.animals;

import MyFarm.animalState.FullState;
import MyFarm.creature.Creature;


public class Dog extends BaseAnimal{
    public Dog() {
        this.isMature = false;
        this.value = 1;
        this.appetite = 2;
        this.name = "Dog";
    }

    public double cost() {
        return this.value;
    }

    public void tick() { return; }

    public Creature clone() {
        return new Dog();
    }

    public String getName() {
        return this.name;
    }

    public void timeChange(int currentTime) {
        if(lastSupplyTime > currentTime) {
            if(currentTime + 24 -lastSupplyTime > 2) {
                // 鸭子饿了
                state.getHungry(this);
                System.out.println("Dog becomes hungry");
            }
            else {
                state.gainExperience(this);
            }
        }
        else {
            // 鸭子饿了
            if(currentTime - lastSupplyTime > 2) {
                state.getHungry(this);
                System.out.println("Dog becomes hungry");
            }
            else {
                state.gainExperience(this);
            }
        }
        if(this.experience >= 96){
            this.isMature = true;
        }
    }

    // 喂食重写-鸭子
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

}
