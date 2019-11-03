package MyFarm.shopping;

import MyFarm.owner.Owner;

public class Proxy implements ShoppingUtils{
    private Owner buyer;

    public Proxy(Customer vis){
        //buyer = new Owner(vis);

    }


    @Override
    public void OutGood() {
        System.out.println("询问顾客需要什么商品");

        buyer.OutGood();

    }
}
