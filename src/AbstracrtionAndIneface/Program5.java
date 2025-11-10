package AbstracrtionAndIneface;
interface app{
    void facebook();
    void instamart();
}
interface camera{
    void allow();
    void deny();
}
class Phone implements app,camera{
    public void facebook(){
        System.out.println("camera required ? ");
    }
    public void allow(){
        System.out.println("permission granted");
    }
    public void instamart(){
        System.out.println("camera required ? ");
    }
    public void deny(){
        System.out.println("permission not granted");
    }
}
public class Program5 {
    static void main(String[] args) {
        app obj1 = new Phone();
        obj1.facebook();
        camera obj2 = new Phone();
        obj2.allow();
        obj1.instamart();
        obj2.deny();
    }
}
