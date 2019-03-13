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

    public void takeOff(){
        if(this.flyingStatus == true){
            throw new IllegalArgumentException("Plane is flying!");
        }
        this.flyingStatus = true;
    }

}