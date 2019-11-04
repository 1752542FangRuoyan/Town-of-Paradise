package MyFarm.NullObject;

import MyFarm.menu.BaseMenu;

public class ProductFactory{
    BaseMenu basemenu;
	public  String[] getString() {
		int size = basemenu.creatures.size();
   	    String[] name= new String[10];
   	    for(int i = 0; i < size; i++) {
   		    name[i] = basemenu.creatures.get(i).name;		
   	    }
   	    return name;
	}
	String[] names = getString();
   
    public AbstractProduct getProduct(String name){
       for (int i = 0; i < names.length; i++) {
          if (names[i] != null && names[i].equalsIgnoreCase(name)){
             return new RealProduct(name);
          }
       }
       return new NullProduct();
    } 
}