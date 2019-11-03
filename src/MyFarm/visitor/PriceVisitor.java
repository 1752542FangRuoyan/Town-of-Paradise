package MyFarm.visitor;

import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;

public class PriceVisitor implements MyVisitor {



    @Override
    public void visit(PlantMenu plantMenu) {
        System.out.println("植物的价格为：");
    }

    @Override
    public void visit(AnimalMenu animalMenu) {
        System.out.println("动物的价格为：");
    }
}
