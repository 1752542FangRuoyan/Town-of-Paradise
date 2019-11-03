package MyFarm.factories;

public class FactoryProducer {
    public BaseFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Creature")){
            return new BaseCreatureFactory();
        }
        else if(choice.equalsIgnoreCase("Tool")){
            return new BaseToolFactory();
        }
        return null;
    }
}
