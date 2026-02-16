package Feb16;
class Animal{
    String name ;
    int age ;
    Animal(){
        System.out.println("animal constructor called");
    }
    void speak(){
        System.out.println("animal speak");
    };
    void eat(){
        System.out.println("animal eats");
    };
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
class lion extends Animal{
    lion(){
        name="SHER";
        age = 99 ;
        System.out.println("Lion constructor called ");
    }
    @Override
    void speak() {
        System.out.println("lion roars ");
    }
}
class dog extends Animal{
    dog(){
        name = "Dogesh" ;
        age = 8;
        System.out.println("dog constructor called ");
    }
    @Override
    void speak() {
        super.speak();
    }
    @Override
    void eat() {
        super.eat();
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal an  = new Animal();
        an.speak();
        an.show();
        Animal obj = new lion();
        obj.speak();
        obj.show();
        Animal ani = new dog();
        ani.speak();
        ani.eat();
        ani.show();
    }
}
