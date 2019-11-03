package MyFarm.visitor;

import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;

public interface MyVisitor {
    public void visit(PlantMenu plantMenu);

    public void visit(AnimalMenu animalMenu);
}
