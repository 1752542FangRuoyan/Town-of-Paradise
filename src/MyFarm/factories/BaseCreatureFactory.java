/**
 * 基本的植物工厂
 */
package MyFarm.factories;

import MyFarm.farmland.BuildingLand;
import MyFarm.farmland.FarmLand;
import MyFarm.tool.Tool;
import MyFarm.farmland.BaseLand;

import java.io.Serializable;

public class BaseCreatureFactory extends BaseFactory implements Serializable {
    public FarmLand farmLand;
    public BuildingLand buildingLand;

    public BaseCreatureFactory(){
        this.farmLand = null;
        this.buildingLand = null;
    }

    public BaseLand getLand(String land_type){
        if(land_type == null){
            return null;
        }
        else if (land_type == "FarmLand"){
            System.out.println("Create a new FarmLand!");
            if(this.farmLand == null){
                this.farmLand = new FarmLand();
                return this.farmLand;
            }
            else{
                return this.farmLand;
            }
        }
        else if (land_type == "BuildingLand"){
            System.out.println("Create a new BuildingLand!");
            if(this.buildingLand == null){
                this.buildingLand = new BuildingLand();
                return this.buildingLand;
            }
            else{
                return this.buildingLand;
            }
        }
        return null;
    }

    @Override
    public Tool getTool(String tool_type) {
        return null;
    }
}
