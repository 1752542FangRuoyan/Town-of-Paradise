package MyFarm.NullObject;

public class NullProduct extends AbstractProduct {
 
   @Override
   public String getName() {
      return "This Product Not Exist!";
   }
 
   @Override
   public boolean isNil() {
      return true;
   }
}
