package MyFarm.shopping;

public class Customer {
    private String name;
    public String wantGrocery;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String getWantGrocery() {
        return wantGrocery;
    }

    public void setWantGrocery(String wantGrocery) {
        this.wantGrocery = wantGrocery;
    }
}
