package MyFarm.creature;

import MyFarm.animalState.Context;
import MyFarm.animalState.HungryState;
import MyFarm.animalState.State;

import java.io.Serializable;

public abstract class Creature implements Context, CreaturePrototype, Serializable {

    public boolean isSaled;
    public int experience = 0;
    public double value = 0;
    public State state = HungryState.getInstance();
    public boolean isMature;

    public String name;

    public abstract double cost();
    public abstract void doSell();
    public abstract Creature clone();

    public  void setName(String name){
        this.name = name;
    }
}
