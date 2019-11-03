package MyFarm.menu;

import MyFarm.animals.BaseAnimal;
import MyFarm.creature.Creature;
import MyFarm.visitor.MyVisitor;

import java.util.ArrayList;

public class AnimalMenu extends BaseMenu implements MyAccept {

    public AnimalMenu(){
        creatures = new ArrayList<Creature>();
    }

    /**
     * Adds an animal into the group
     * @param animal The animal to be added
     */
    public void addAnimal(BaseAnimal animal){
        creatures.add(animal);
    }

    /**
     * Return the animal in the animal list by index
     * @param index The index of the animal
     * @return The animal in the list
     */
    public BaseAnimal getAnimal(int index){
        return (BaseAnimal) creatures.get(index);
    }

    /**
     * Remove the animal in the animal list by index
     * @param index The index of the animal
     */
    public void removeAnimal(int index){
        creatures.remove(index);
    }

    /**
     * Remove the animal in the animal list
     * @param animal The animal you want to remove
     */
    public void removeAnimal(BaseAnimal animal){
        creatures.remove(animal);
    }

    /**
     * Get the size of the group
     * @return The size of the group
     */
    public int size(){
        return creatures.size();
    }


    @Override
    public void accept(MyVisitor myVisitor) {
      myVisitor.visit(this);
    }
}