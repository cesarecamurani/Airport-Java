package transports;

class Plane {

    String planeType;
    boolean flyingStatus;

    Plane(String planeType){
        this.planeType = planeType;
        this.flyingStatus = true;
    }

    void land(){
        this.flyingStatus = false;
    }

    void takeOff(){
        if(this.flyingStatus){
            throw new Error("Plane is flying!");
        }
        this.flyingStatus = true;
    }

}
