/**
 * 基本的植物类
 * 动物植物均继承自此
 */
package MyFarm.plants;

import MyFarm.Farm;
import MyFarm.animalState.State;
import MyFarm.creature.Creature;

public abstract class BasePlant extends Creature {

    public void doSell(){
        if(this.isSaled){
            System.out.println("This plant is already saled!");
        }
        else{
            this.isSaled = true;
            Farm instance = Farm.getInstance();
            instance.plantMenu.removePlant(this);
            System.out.println("Sale finished!");
        }
    }
    public void changeState(State state) {}
    public void getFed(int currentTime) {}
}
