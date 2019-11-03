package MyFarm.tool;

public class BigBowl extends Bowl {
    public BigBowl() {
        this.name = "BigBowl";
        this.food = new AddMuchFood();
    }
    public void AddFood(int amount) {
        this.food.AddFood(amount);
    }
}
