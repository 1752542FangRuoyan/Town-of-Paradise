package MyFarm;

import MyFarm.animals.Pig;
import MyFarm.creature.CreatureModule;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;
import MyFarm.plants.BasePlant;

public class Facade {
    private PlantMenu plantMenu;
    private AnimalMenu animalMenu;
    
    public Facade(PlantMenu pm, AnimalMenu am){
        plantMenu=pm;
        animalMenu=am;
    }
    
    public void plantCrop(String name){
        BasePlant plant = (BasePlant) CreatureModule.MyClone("Crop");
        plant.setName(name);
        plantMenu.addPlant(plant);
        System.out.println("新生成了" + plant.getName());
    }

    public void newPig(String name){
        Pig pig = (Pig) CreatureModule.MyClone("Pig");
        pig.setName(name);
        animalMenu.addAnimal(pig);
        System.out.println("新生成了" + pig.getName());
    }
}
