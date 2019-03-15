package transports;

import java.util.*;

public class Airport {

    ArrayList<Plane> hangar;
    String currentWeather = "Sunny";
    Weather today = new Weather(currentWeather);
    int capacity;

    Airport(ArrayList<Plane> hangar){
        this.hangar = hangar;
        this.capacity = 10;
    }

    void changeCapacity(int capacity){
        this.capacity = capacity;
    }

    void clearForLanding(Plane plane){
        if(today.currentWeather.equals("Stormy")){
            throw new Error("Cannot land if Stormy!");
        }
        if(hangar.size() >= capacity) {
            throw new Error("Airport is full!");
        }
        plane.land();
        hangar.add(plane);
    }

    void clearForTakeOff(Plane plane){
        if(today.currentWeather.equals("Stormy")){
            throw new Error("Cannot takeoff if Stormy!");
        }
        if(!hangar.contains(plane)) {
            throw new Error("Plane not present!");
        }
        plane.takeOff();
        hangar.remove(plane);
    }

}