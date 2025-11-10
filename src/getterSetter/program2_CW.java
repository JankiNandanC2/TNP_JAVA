package getterSetter;
class Bus{
    int noOfWheel;
    String engine ;
    double speed ;
    int noOfSeats ;
    boolean isBusPublic ;
// setter
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }
    public void setBusPublic(boolean busPublic) {
        isBusPublic = busPublic;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
// getter
    public int getNoOfWheel() {
        return noOfWheel;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
    public double getSpeed() {
        return speed;
    }
    public String getEngine() {
        return engine;
    }

    public boolean isBusPublic() {
        return isBusPublic;
    }
}
public class program2_CW {
    static void main(String[] args) {
        Bus obj = new Bus();
        obj.setEngine("Bmw engine 3x5.4884");
        obj.setBusPublic(true);
        obj.setSpeed(99.892);
        obj.setNoOfSeats(122);
        obj.setNoOfWheel(12);
        System.out.println("Name of engine : "+obj.engine);
        System.out.println("is bus public : "+obj.isBusPublic);
        System.out.println("speed of bus : "+obj.speed);
        System.out.println("total no of seats : "+obj.noOfSeats);
        System.out.println("total no of wheel : "+obj.noOfWheel);
    }
}
