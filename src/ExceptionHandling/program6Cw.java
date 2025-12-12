package ExceptionHandling;

import java.util.InputMismatchException;

// to manually throw the exception we use throw keyboard  --- using throw

class arr{
    String[] str = {"Rohit","Virat","Keshav","Madhav"};
    // String find = "Anushka";
    boolean flag = false ;
    void find(String name){
        for(int i = 0 ; i<str.length ; i++){
            if(name.equals(str[i])){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("name found");
        else throw new InputMismatchException("name mismatch");
//        else throw new InputMismatchException("name mismatch");
    }
}

public class program6Cw {
   public static void main(String[] args) {
        arr obj =new arr();
        obj.find("Anushka");
    }
}
