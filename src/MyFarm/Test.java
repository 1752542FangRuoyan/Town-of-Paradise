package MyFarm;

import MyFarm.animals.BaseAnimal;
import MyFarm.animals.Pig;
import MyFarm.menu.AnimalMenu;
import MyFarm.tool.Tool;
import MyFarm.creature.Creature;
import MyFarm.creature.CreatureModule;
import MyFarm.factories.BaseFactory;
import MyFarm.farmland.BaseLand;
import MyFarm.menu.PlantMenu;
import MyFarm.plants.BasePlant;
import MyFarm.tool.ToolPackage;
import MyFarm.visitor.MyVisitor;
import MyFarm.visitor.NumVisitor;

import static MyFarm.creature.CreatureModule.initializePrototype;

public class Test {

    public static void main(String[] args) {

        // 初始化
        Farm farm = Farm.getInstance();
        AnimalMenu animalMenu = new AnimalMenu();
        PlantMenu plantMenu = new PlantMenu();

        // 测试原型模式
        System.out.println("");
        System.out.println("=====现在开始测试原型模式:====：");
        initializePrototype();

        Pig pig = (Pig) CreatureModule.MyClone("Pig");
        pig.setName("Pig1");
        animalMenu.addAnimal(pig);
        System.out.println("新生成了" + pig.getName());

        BaseAnimal animal = (BaseAnimal) CreatureModule.MyClone("Pig");
        animalMenu.addAnimal(animal);
        pig.setName("Pig2");
        System.out.println("新生成了" + pig.getName());

        BasePlant plant = (BasePlant) CreatureModule.MyClone("Crop");
        plantMenu.addPlant(plant);
        plant.setName("Crop1");
        System.out.println("新生成了" + plant.getName());

        Creature dog = CreatureModule.MyClone("Dog");
        animalMenu.addAnimal((BaseAnimal) dog);
        dog.setName("Dog1");
        System.out.println("新生成了" + dog.getName());

        Creature cow = CreatureModule.MyClone("Cow");//测试不存在的情况


        // 测试抽象工厂模式和享元模式
        System.out.println("");
        System.out.println("=====现在开始测试抽象工厂模式=====");
        BaseFactory cultivation_factory = Farm.getInstance().creature_factory;
        BaseFactory tool_factory = Farm.getInstance().tool_factory;

        System.out.println("=====现在开始测试工厂模式=====");
        System.out.println("从Factory获取土地");
        BaseLand building_land = cultivation_factory.getLand("BuildingLand");
        BaseLand farmLand = cultivation_factory.getLand("FarmLand");

        System.out.println("从Factory获取工具");
        Tool hoe = tool_factory.getTool("Hoe");
        Tool big_bowl = tool_factory.getTool("BigBowl");
        Tool small_bowl = tool_factory.getTool("SmallBowl");


        // 测试建造者模式
        System.out.println("");
        System.out.println("=====现在开始测试建造者模式和享元模式=====");
        ToolPackage tool_package = new ToolPackage();

        tool_package.addTool(hoe);
        tool_package.addTool(big_bowl);
        tool_package.addTool(small_bowl);
        tool_package.addTool(tool_factory.getTool("Hoe"));
        tool_package.addTool(tool_factory.getTool("Hoe"));
        tool_package.addTool(tool_factory.getTool("BigBowl"));
        tool_package.addTool(tool_factory.getTool("SmallBowl"));

        System.out.println("工具包已经生成");



        //visitor
        MyVisitor myVisitor = new NumVisitor();
        plantMenu.accept(myVisitor);

    }
}
