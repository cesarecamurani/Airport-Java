package transports;

import java.util.*;

public class Airport {

    ArrayList<Plane> hangar;

    public Airport(ArrayList<Plane> hangar){
        this.hangar = hangar;
    }

    ArrayList<Plane> clearForLanding(Plane plane){
        hangar.add(plane);
        return hangar;
    }

    ArrayList<Plane> clearForTakeOff(Plane plane){
        hangar.remove(plane);
        return hangar;
    }

    public static void main(String...args){
        ArrayList<Plane> hangar = new ArrayList<>();
        var boeing = new Plane("boeing");
        var heathrow = new Airport(hangar);
        heathrow.clearForLanding(boeing);
        heathrow.clearForTakeOff(boeing);
    }
}