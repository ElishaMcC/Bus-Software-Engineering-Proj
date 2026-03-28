package permissions;

import java.util.ArrayList;
import java.util.List;

import primary.Station;
import primary.User;



public class StationManager extends User{
    private static StationManager instance = new StationManager();
    //Created Arraylist for stations
    private static List<Station> stations = new ArrayList<>();
    
    private StationManager(){}; //default constructor

    public StationManager(String name, String username, String password, String perms) {
            super(name, username, password, "busManager");
    }

    public static StationManager getInstance(){
        return instance;
    }

    public static List<Station> getStations(){
        return stations;
    }


}
