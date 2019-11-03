package MyFarm.tool;

import java.io.Serializable;

public class Tool implements Serializable {
    public String name;

    public  void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return this.name;
    }
}
