package Feb17;

import java.util.Scanner;

class Bank{
    double amount ;
    double intrest ;
    Bank(double a , double i){
        this.amount = a;
        this.intrest = i ;
    }
    double finalAmt ;
    void calculate(){
         finalAmt = amount + ((intrest/amount)*100) ;
    }
    void show(){
        System.out.println("Amount is : "+amount);
        System.out.println("Interest is : "+intrest);
        System.out.println("Final Amount is : "+finalAmt);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Enter amount and Interest percent : ");
        Scanner scan = new Scanner(System.in);
        double amt = scan.nextDouble();
        double i = scan.nextDouble();
        Bank b = new Bank(amt , i);
        b.calculate();
        b.show();
    }
}
