package transports;

import java.util.*;

public class Airport {

    ArrayList<Plane> hangar;
    int capacity;

    Airport(ArrayList<Plane> hangar){
        this.hangar = hangar;
        this.capacity = 10;
    }

    void clearForLanding(Plane plane){
        if(hangar.size() >= capacity) {
            throw new Error("Airport is full!");
        } else {
            hangar.add(plane);
        }
    }

    void clearForTakeOff(Plane plane){
        hangar.remove(plane);
    }

    public static void main(String...args){
        ArrayList<Plane> hangar = new ArrayList<>();
        var boeing = new Plane("boeing");
        var heathrow = new Airport(hangar);
        heathrow.clearForLanding(boeing);
        heathrow.clearForTakeOff(boeing);
    }
}