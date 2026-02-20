package Feb20;

import javax.xml.crypto.Data;

class DataSize{
    void size(int kb){
        System.out.println(kb*1024 +" Bytes");
    }
    void size(int mb , int kb ){
        System.out.println(mb*1024 + kb  +" kb");
    }
    void size(int gb , int mb ,int kb){
        System.out.println(gb*1024*1024 + mb*1024 +kb  +" kb");
    }
}
public class DataConversion {
    public static void main(String[] args) {
        DataSize d = new DataSize();
        d.size(4);
        d.size(4,80);
        d.size(4,8,80);
    }
}
