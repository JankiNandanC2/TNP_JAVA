package Constructo;

class game{
    String name ;
    int number ;
    game(){
        System.out.println("hello Constructor");
    }
    game(String name , int number){
//        System.out.println("Its costly man !");
        this.name = name;
        this.number=number;
    }
    game(game yt){
        this.name=yt.name;
        this.number=yt.number;
    }
    public void show() {
        System.out.println("name is :"+name);
        System.out.println("number is :"+number);
    }
}
public class Basics {
    static void main() {
        game obj = new game();  //default constructor
        game obj2= new game("janki",51); // parametrised constructor
        obj2.show();
        game obj3= new game(obj2); // copy constructor
        obj3.show();
    }
}
