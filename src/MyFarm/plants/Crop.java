package MyFarm.plants;

import MyFarm.animalState.CropState;
import MyFarm.creature.Creature;
import MyFarm.creature.CreaturePrototype;

public class Crop extends BasePlant implements CreaturePrototype {

    public Crop(){
        this.isMature = false;

        this.state = CropState.getInstance();
        this.name = "Crop";
    }

    public void doSell(){

    }
    public void tick(){

    }

    public Creature clone() {
        return new Crop();
    }

    public String getName() {
        return name;
    }

    public void timeChange(int currentTime) {
        state.gainExperience(this);
        if(this.experience >= 72){
            this.isMature = true;
        }
    }

    public double cost() {
        return 0.1;
    }
}
