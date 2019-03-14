package transports;

import java.util.*;

public class Airport {

    ArrayList<Plane> hangar;

    Airport(ArrayList<Plane> hangar){
        this.hangar = hangar;
    }

    void clearForLanding(Plane plane){
        hangar.add(plane);
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