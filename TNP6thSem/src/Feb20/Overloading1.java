package Feb20;

class A {
    private void m1(){
        System.out.println("hello");
    }
    int add(int a , int b){
        return a+b;
    }
    int add(int a ,int b,int c ){
        return a+b+c ;
    }
    double add(double a , int b){
        return  a +  b;
    }
//    private double add(double a , int b){
//        return  a +  b;
//    }
    double add(double a ,int b,int c ){
        return a+b+c ;
    }

}
public class Overloading1 {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.add(88,12));
        System.out.println(obj.add(88,12,100));
        System.out.println(obj.add(88.55,12));
        System.out.println(obj.add(88.99,12,100));
    }
}
