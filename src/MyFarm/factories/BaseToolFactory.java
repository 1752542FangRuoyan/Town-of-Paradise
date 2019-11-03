package MyFarm.factories;

import MyFarm.tool.Tool;
import MyFarm.tool.BigBowl;
import MyFarm.tool.Hoe;
import MyFarm.tool.SmallBowl;
import MyFarm.farmland.BaseLand;

import java.io.Serializable;

public class BaseToolFactory extends BaseFactory implements Serializable {
    public Tool hoe;
    public Tool Smallbowl;
    public Tool Bigbowl;
    public BaseToolFactory(){
        this.hoe = null;
        this.Smallbowl = null;
        this.Bigbowl = null;
    }

    @Override
    public BaseLand getLand(String land_type) {
        return null;
    }

    public Tool getTool(String tool_type){
        if(tool_type == null){
            return null;
        }
        else if(tool_type.equalsIgnoreCase("Hoe")){
            System.out.println("Create a new Hoe!");
            if(this.hoe == null){
                this.hoe = new Hoe();
                return this.hoe;
            }
            else{
                return this.hoe;
            }
        }
        else if(tool_type.equalsIgnoreCase("BigBowl")){
            System.out.println("Create a new BigBowl!");
            if(this.Bigbowl == null){
                this.Bigbowl = new BigBowl();
                return this.Bigbowl;
            }
            else{
                return this.Bigbowl;
            }
        }
        else if(tool_type.equalsIgnoreCase("SmallBowl")){
            System.out.println("Create a new SmallBowl!");
            if(this.Smallbowl == null){
                this.Smallbowl = new SmallBowl();
                return this.Smallbowl;
            }
            else{
                return this.Smallbowl;
            }
        }
        return null;
    }
}