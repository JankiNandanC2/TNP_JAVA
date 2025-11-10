package Encapsulaion;

import java.util.Scanner;

class account{
    private double accNo ;
    private double balance ;

    // getter setter
    public void setAccNo(double accNo){
        this.accNo = accNo ;
    }
    public double getAccNo() {
        return accNo;
    }

    public void deposit(int balance){
        this.balance = balance ;
    }
    public void withdraw(int amt){
        if((this.balance - amt ) > 0 ){
            this.balance = this.balance - amt ;
        }
        else
            System.out.println("insufficient amount");
    }
    public void showBalance(){
        System.out.println("account balance is : "+balance);
    }
}
public class Program_cw {
    static void main(String[] args) {
        account obj = new account();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your acc No : ");
        obj.setAccNo(scan.nextDouble());
        System.out.println("your account number is : "+ obj.getAccNo());
        obj.deposit(1000);
        obj.withdraw(5000);
        obj.showBalance();
    }
}
