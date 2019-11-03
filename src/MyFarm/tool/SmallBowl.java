package MyFarm.tool;

public class SmallBowl extends Bowl {
    public SmallBowl() {
        this.name = "SmallBowl";
        this.food = new AddLittleFood();
    }
    public void AddFood(int amount) {
        this.food.AddFood(amount);
    }
}
