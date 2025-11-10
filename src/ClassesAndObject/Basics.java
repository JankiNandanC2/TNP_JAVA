package ClassesAndObject;

import java.util.Scanner;

class digital{
    int age ;
    String name ;
    public void get(){
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        name = scan.nextLine();
    }
    public void print(){
        System.out.println("my name is "+name+"\nand my age is :"+age);
    }
}
public class Basics {
    static void main(String[] args) {
           digital object = new digital();
           object.name="janki Nandan";
           object.age=20;
           object.print();
    }
}


