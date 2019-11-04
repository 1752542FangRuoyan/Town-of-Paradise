package MyFarm.Iterator;

import MyFarm.menu.BaseMenu;

public class IteratorPatternDemo {
   //3、使用NameRepository获取迭代器，返回查询到的信息
	
	
    public static void PrintProducts() {
    	
      NameRepository namesRepository = new NameRepository();      
      System.out.println("Result List");
      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String product_name = (String)iter.next();
         if(product_name != null) {
            System.out.println("Name : " + product_name);     	 
         }

      }  
   }
}