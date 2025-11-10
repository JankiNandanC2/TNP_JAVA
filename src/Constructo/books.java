package Constructo;
class book{
    String name ;
    int price ;
    book(){
        System.out.println("welcome tto book store");
    }
    book(int p , String name ){
        this.price=p;
        this.name=name;
    }
    book(book bk){
        this.name= bk.name;;
        this.price=bk.price;
    }
    public void show(){
        System.out.println(name);
        System.out.println(price);
    }
}
public class books {
    static void main() {
        book obj1 =new book();
        book obj2 =new book(99,"java fundamental");
        book obj3 =new book(obj2);
        obj3.show();;
    }
}
