package MyFarm.tool;

public abstract class Bowl extends Tool {
    public Bowl(){
        System.out.println("=====Initiallize a Bowl");
    }
    protected Food food;
    public abstract void AddFood(int amount);
}
