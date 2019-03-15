package transports;

import java.util.*;

public class Airport {

    ArrayList<Plane> hangar;
    int capacity;

    Airport(ArrayList<Plane> hangar){
        this.hangar = hangar;
        this.capacity = 10;
    }

    void changeCapacity(int capacity){
        this.capacity = capacity;
    }

    void clearForLanding(Plane plane, Weather today){
        if(today.currentWeather.equals("Stormy")){
            throw new Error("Cannot land if Stormy!");
        }
        if(hangar.size() >= capacity) {
            throw new Error("Airport is full!");
        }
        plane.land();
        hangar.add(plane);
        System.out.println("We landed safely!");
    }

    void clearForTakeOff(Plane plane, Weather today){
        if(today.currentWeather.equals("Stormy")){
            throw new Error("Cannot takeoff if Stormy!");
        }
        if(!hangar.contains(plane)) {
            throw new Error("Plane not present in the hangar!");
        }
        plane.takeOff();
        hangar.remove(plane);
        System.out.println("Half job has been done!");
    }

}