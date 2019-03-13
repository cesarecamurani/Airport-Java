package transports;

import java.util.*;

public class Airport {

    public ArrayList<Plane> hangar;

    public Airport(ArrayList<Plane> hangar){
        this.hangar = hangar;
    }

    public ArrayList<Plane> clearForLanding(Plane plane){
        this.hangar.add(plane);
        return this.hangar;
    }
}