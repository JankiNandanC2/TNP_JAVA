package Constructo;
class gadget{
    String name ;
    int price ;
    String brand;
    gadget(){
        System.out.println("welcome to gadget store");
    }
    gadget(int p , String name , String brand){
        System.out.println("paramerised consttuctor ");
        this.price=p;
        this.name=name;
        this.brand = brand;
    }
    gadget(gadget bk){
        System.out.println("copy constructor");
        this.name= bk.name;;
        this.price=bk.price;
        this.brand = bk.brand;
    }
    public void show(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
    }
}
public class Gadgets {
    static void main() {
        gadget obj1 = new gadget();
        gadget obj2 = new gadget(999,"benten watch","carton brand");
        obj2.show();
        gadget obj3 = new gadget(obj2);
        obj3.show();
    }
}
