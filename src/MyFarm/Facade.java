package MyFarm;

import MyFarm.creature.Creature;
import MyFarm.menu.AnimalMenu;

public class Facade {
    static private AnimalMenu animals;
    public Facade(AnimalMenu animals){
        this.animals=animals;
    }
    static public void feedAll(){
        for (Creature x:animals.creatures
             ) {
            x.getFed(Timer.getCurrentTime());
        }
    }
    static public void showHunger(String name){
        System.out.println(name+"is hungry.");
    }
}
