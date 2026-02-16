package Feb16;
abstract class smartPhone{
    String name ;
    int year ;
    abstract public void turnOff();
    abstract public void turnOn();
    void show(){
        System.out.println(name);
        System.out.println(year);
    }
}
class Samsung extends smartPhone{
    @Override
    public void turnOff() {
        System.out.println("Samsung is turned off");
    }
    @Override
    public void turnOn(){
        System.out.println("Samsung is turned on");
    }
}
public class Abstarct {
    public static void main(String[] args) {
        Samsung s  = new Samsung();
        s.name="Samsung Galaxy 66";
        s.year = 2027 ;
        s.show();
        s.turnOff();
        s.turnOn();
    }
}
