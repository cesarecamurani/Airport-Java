package transports;

public class Plane {

    public String planeType;
    public boolean flyingStatus;

    public Plane(String planeType){
        this.planeType = planeType;
        this.flyingStatus = true;
    }

    public void land(){
        this.flyingStatus = false;
    }

}