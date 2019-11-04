package MyFarm.NullObject;

public class NullPatternDemo {
	//4、使用第三步中创建的类，基于传递的产品名字，获取RealProduct或NullProduct对象
	public static void FindProducts(String[] args) {
	ProductFactory pf = new ProductFactory();
	AbstractProduct Product1 = pf.getProduct("Pig1");
	AbstractProduct Product2 = pf.getProduct("Pig2");
	AbstractProduct Product3 = pf.getProduct("Crop1");
    AbstractProduct Product4 = pf.getProduct("Dog1");
    AbstractProduct Product5 = pf.getProduct("Dog2");
	 
	System.out.println("Products List");
	System.out.println(Product1.getName());
	System.out.println(Product2.getName());
	System.out.println(Product3.getName());
	System.out.println(Product4.getName());
	System.out.println(Product5.getName());
	}
}
