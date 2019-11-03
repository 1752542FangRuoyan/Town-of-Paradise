package MyFarm.visitor;

import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;

public class NumVisitor implements MyVisitor {


    @Override
    public void visit(PlantMenu plantMenu) {
        int a=plantMenu.creatures.size();
        System.out.println("植物的数量为"+a);
    }

    @Override
    public void visit(AnimalMenu animalMenu) {
        System.out.println("动物的数量为");
    }
}
