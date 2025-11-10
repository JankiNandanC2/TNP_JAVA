package ClassesAndObject;

import java.util.Scanner;

class cricketPlayer{
    String Name;
    int run  ;
    int wicket;
    public void AddRuns(int a ){
        run = run+a;
        System.out.println("total run : "+run);
    }
    public void takeWickets(){
        wicket = wicket+1 ;
        System.out.println("no of wicket is "+wicket);
    }
}
public class _3_cricket {
    static void main() {
        Scanner scan = new Scanner(System.in);
        cricketPlayer obj = new cricketPlayer();
        obj.wicket=0;
        obj.run=99;
        System.out.println("enter name ");
        obj.Name = scan.nextLine();
        obj.AddRuns(6);
        obj.takeWickets();
    }
}
