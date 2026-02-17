package Feb17;

class base{
    void m2(){
        System.out.println("Parent");
    }
    public static int add(int a , int b ){
        return a+b ;
    }
    public static int add(int a , int b, int c ){
        return a+b+c ;
    }
}
class derived extends base{
    @Override
    void m2() {
        super.m2();
        System.out.println("child method ");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        base ch = new derived();
        ch.m2();
        base b= new base();
        System.out.println(b.add(100,99));
    }
}
