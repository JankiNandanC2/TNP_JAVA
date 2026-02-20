package Feb20;
class Distance{
    // m to cm
    void convert(int m){
        int rem = m % 100 ;
        int quo = m /100 ;
        System.out.println(quo+" metre "+rem+" cm");
    }
    // km to m
    void convert(double km){
        System.out.println(km*1000 +" metre ");
    }
}
public class Overloading2Converter {
    public static void main(String[] args) {
        Distance d = new Distance();
        d.convert(590);
        d.convert(55.0);
    }
}
