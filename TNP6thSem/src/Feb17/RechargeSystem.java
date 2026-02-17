package Feb17;

import java.util.Scanner;

class Payment{
    int  rechargeAmount ;
    double chargesPercent ;
    double finalCharges ;
    public void pay(int r , double c ){
        this.rechargeAmount=r;
        this.chargesPercent = c ;
        this.finalCharges = r+((c/100)*r);
        System.out.println("payment kar lo babu  .... ");
    }
    void show(){
        System.out.println("recharge amount : "+rechargeAmount);
        System.out.println("charges : "+chargesPercent);
        System.out.println("Final Charges : "+finalCharges);
    }
}
class googlePay extends Payment{
    @Override
    public void pay(int r, double c ) {
        super.rechargeAmount= r ;
        super.chargesPercent = c ;
        super.finalCharges = rechargeAmount + ((chargesPercent/rechargeAmount)*100) ;
        System.out.println("Google Pay se payment kar rha h babu ...  ");
    }
}
class CreditCard extends Payment{
    @Override
    public void pay(int r, double c ) {
        super.rechargeAmount= r ;
        super.chargesPercent = c ;
        super.finalCharges = rechargeAmount + ((chargesPercent/rechargeAmount)*100) ;
        System.out.println("CreditCard se payment kar rha h babu ...  ");
    }
}
class PhonePay extends Payment{
    @Override
    public void pay(int r, double c ) {
        super.rechargeAmount= r ;
        super.chargesPercent = c ;
        super.finalCharges = rechargeAmount + ((chargesPercent/rechargeAmount)*100) ;
        System.out.println("PhonePay se payment kar rha h babu ...  ");
    }
}
class Paytm extends Payment{
    @Override
    public void pay(int r, double c ) {
        super.rechargeAmount= r ;
        super.chargesPercent = c ;
        super.finalCharges = rechargeAmount + ((chargesPercent/rechargeAmount)*100) ;
        System.out.println("Paytm se payment kar rha h babu ...  ");
    }
}
public class RechargeSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount and charges : ");
        int amount = scan.nextInt();
        double charges = scan.nextDouble();
        Payment p = new googlePay();
        p.pay(amount,charges+1);
        p.show();
        Payment c = new CreditCard();
        c.pay(amount,charges+5);
        c.show();
        Payment ph = new PhonePay();
        ph.pay(amount,charges+0.5);
        ph.show();
        Payment pa = new Paytm();
        pa.pay(amount,charges+1);
        pa.show();
    }
}
