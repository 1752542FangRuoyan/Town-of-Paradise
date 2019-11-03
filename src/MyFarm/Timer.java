package MyFarm;

public class Timer {
    static private long startTime=System.currentTimeMillis();
    static public int getCurrentTime(){
        return (int)((System.currentTimeMillis()-startTime)/1000);
    }
}
