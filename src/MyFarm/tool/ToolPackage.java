package MyFarm.tool;
import java.util.ArrayList;

public class ToolPackage {
    public ArrayList<Tool> my_package;

    public ToolPackage(){
        my_package = new ArrayList<Tool>();
    }

    public void addTool(Tool tool){
        this.my_package.add(tool);
    }
}