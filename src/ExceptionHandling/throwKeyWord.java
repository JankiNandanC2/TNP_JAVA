package ExceptionHandling;

import java.util.InputMismatchException;

class Game{
    String Name="JankiNandan";
    int age ;
    void change(String Name){
        if(this.Name.equals(Name))
            System.out.println(" it is okay both names are same");
        else
            throw new InputMismatchException("Invalid / different string");
    }
    void change(int age){
        if(age>=18)
            System.out.println("allowed to vote ");
        else
            throw new ArithmeticException ("Invalid age , not eligible to vote ");
    }
}
public class throwKeyWord {
    static void main(String[] args) {
        Game obj = new Game();
        obj.change("JankiNandan");
//        obj.change("janki");
        obj.change(17);
    }
}
