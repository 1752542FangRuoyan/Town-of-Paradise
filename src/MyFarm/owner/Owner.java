package MyFarm.owner;

import MyFarm.shopping.Customer;
import MyFarm.shopping.ShoppingUtils;
import MyFarm.Mediator;

public class Owner implements MoneyGetter, ShoppingUtils {
    private double money;
    private Customer buyer;

    public void setOwnerCustomerName(Customer vis){
        this.buyer = vis;
    }



    private static Owner instance = new Owner();

    private Owner(){
        this.money = 1000;
    }

    /**
     * Get the instance of the owner
     * @return The instance of the owner
     */
    public static Owner getInstance() {
        Owner temp = instance;
        if(temp == null){
            synchronized(Owner.class){
                temp = instance;
                if(temp == null){
                    instance = new Owner();
                    temp = instance;
                }
            }
        }
        return temp;
    }


    /**
     * Get the money of the owner
     * @return The money of the owner
     */
    public double getMoney(){
        return this.money;
    }

    /**
     * Edit the money of the owner
     * @param money the number of money, support minus
     */
    public void editMoney(double money){
        this.money += money;
    }

    @Override
    public void OutGood() {
       System.out.println("admin售出一只"+"给"+buyer.getName());
    }
    
    public void feedAll(){
        Mediator.feedAll();
    }
}
