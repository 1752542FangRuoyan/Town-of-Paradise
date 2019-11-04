package MyFarm.NullObject;

import MyFarm.creature.Creature;

public class RealProduct extends AbstractProduct {
	//2、创建扩展上述抽象类的实体类
   public RealProduct(String name) {
      this.name = name;    
   }
   
   @Override
   public String getName() {
      return name;
   }
   
   @Override
   public boolean isNil() {
      return false;
   }
}