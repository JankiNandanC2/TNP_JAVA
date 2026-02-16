package Feb16;
class operation{
    public static void sum(int a , int b ){
        System.out.println(a+b);
    }
    public static int sum(int a , int b ,int c ){
        int sum = a+b ;
        return sum ;
    }
}
public class Basics {
    public static void main(String[] args){
        operation.sum(7,9);
        System.out.println(operation.sum(9,99,1));
    }
}
