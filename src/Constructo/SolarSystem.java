package Constructo;
class planet{
    String name ;
    float mass ;
    double distanceFromSun;
    planet(){
        System.out.println("welcome to Solar system");
    }
    planet(String name ,float m , double d ){
        System.out.println("parameterised constructor ");
        this.name=name;
        this.mass= m;
        this.distanceFromSun= d;
    }
    planet(planet pl){
        System.out.println("copy constructor");
        this.name=pl.name;
        this.mass=pl.mass;
        this.distanceFromSun= pl.distanceFromSun;
    }
    public void show(){
        System.out.println(name);
        System.out.println(mass);
        System.out.println(distanceFromSun);
    }
}
public class SolarSystem {
    static void main() {
        planet obj1 =new planet();
        planet obj2 =new planet("earth",8889889389.9f ,437258896583285883.00);
        obj2.show();
        planet obj3 =new planet(obj2);
        obj3.show();
    }
}
