package MyFarm;

import MyFarm.creature.Creature;
import MyFarm.menu.AnimalMenu;

public class Mediator {
    static private AnimalMenu animals;
    public Mediator(AnimalMenu animals){
        Mediator.animals=animals;
    }
    static public void feedAll(){
        for (Creature x:animals.creatures
             ) {
            x.getFed(Timer.getCurrentTime());
            System.out.println(x.name+" is fed.");
        }
    }
    static public void showHunger(String name){
        System.out.println(name+" is hungry.");
    }
}
