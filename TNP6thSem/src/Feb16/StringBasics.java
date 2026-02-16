package Feb16;

public class StringBasics {
    public static void main(String[] args) {
        String s = "hello" ;
        String t= "hello";
        //  here s and t points to same address
        String u = new String("hello");
        System.out.println(s==t);
        System.out.println(s==u);
        System.out.println();
        // equals
        System.out.println(s.equals(t));
        System.out.println(s.equals(u));
    }
}
