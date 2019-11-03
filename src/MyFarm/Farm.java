package MyFarm;

import MyFarm.tool.AddLittleFood;
import MyFarm.tool.AddMuchFood;
import MyFarm.factories.BaseFactory;
import MyFarm.factories.FactoryProducer;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;

import java.io.Serializable;

public class Farm implements Serializable {
    private static Farm instance = new Farm();

    public AnimalMenu animalMenu = new AnimalMenu();
    public PlantMenu plantMenu = new PlantMenu();


    public BaseFactory tool_factory;
    public BaseFactory creature_factory;


    public AddLittleFood add_little_food;
    public AddMuchFood add_much_food;

    public int warehouse = 200;  // 初始玩家有200食物
    public int foodCourt = 100;  // 初始食槽有100食物

    public Farm(){
        FactoryProducer factory_producer = new FactoryProducer();
        tool_factory = factory_producer.getFactory("Tool");
        creature_factory = factory_producer.getFactory("Creature");

        add_little_food = new AddLittleFood();
        add_much_food = new AddMuchFood();
    }

    /**
     * Return a single instance of BuildingLand
     * @return A single instance of BuildingLand
     */
    public static Farm getInstance(){
        Farm temp = instance;
        if(temp == null){
            synchronized(Farm.class)
            {
                temp = instance;
                if(temp == null){
                    instance = new Farm();
                    temp = instance;
                }
            }
        }
        return temp;
    }




}
