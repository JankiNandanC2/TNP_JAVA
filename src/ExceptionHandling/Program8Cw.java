package ExceptionHandling;
class work{
    void MethodA(int a , int b ) throws Exception{
       int c = a/b ;
    }
    void MethodB(){
        try{
            MethodA(5,0);
        }catch (Exception m){
            System.out.println(m);
            System.out.println(m.getMessage());
        }
    }
}
public class Program8Cw {
    static void main(String[] args) {
        work obj = new work();
        obj.MethodB();
    }
}
