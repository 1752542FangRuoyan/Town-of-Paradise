package MyFarm.animals;

import MyFarm.Mediator;
import MyFarm.Farm;
import MyFarm.animalState.FullState;
import MyFarm.animalState.HungryState;
import MyFarm.creature.Creature;
import MyFarm.owner.Owner;

public abstract class BaseAnimal extends Creature {

    public int lastSupplyTime = 0;
    public int appetite = 0;

    // 喂食
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    public boolean isHungry(){
        return this.state == HungryState.getInstance();
    }

    public int getAppetite(){
        return this.appetite;
    };

    //吴
    public void showHunger(){
        Mediator.showHunger(getName());
    }


    public void doSell(){
        if(this.isSaled){
            System.out.println("This animal is already saled!");
        }
        else{
            this.isSaled = true;

            // Judge the case of the animal
            String name = this.getName();
            if(name == "Pig"){
                Owner.getInstance().editMoney(3000);
            }
            else if(name == "Dog"){
                Owner.getInstance().editMoney(5000);
            }

            // Remove the animal from menu
            Farm instance = Farm.getInstance();
            instance.animalMenu.removeAnimal(this);
            System.out.println("Sale finished!");
        }
    }

}
