package MyFarm.Iterator;

import MyFarm.menu.BaseMenu;
import MyFarm.Iterator.NameRepository;

public class NameRepository implements Container{
	//2、创建实现了Container接口的实体类，该类有实现了Iterator接口的内部类
	BaseMenu basemenu;
	public String[] getString() {
		int size = basemenu.creatures.size();
    	String[] names= new String[10];
    	for(int i = 0; i < size; i++) {
    		names[i] = basemenu.creatures.get(i).name;		
    	}
    	return names;
	}
	String[] product_names = getString();
	
	//String[] product_names = {"Pig1","Pig2","Dog1"};
	
    @Override
    public Iterator getIterator(){
      return new NameIterator();
    }

	private class NameIterator implements Iterator {
      int index;
      
      @Override
      public boolean hasNext() {
         if(index < product_names.length){
            return true;
         }
         return false;
      }
 
      @Override
      public Object next() {
         if(this.hasNext()){
            return product_names[index++];
         }
         return null;
      }     
   }
}
