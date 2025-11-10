package ClassesAndObject;
class CryptoWallet{
    String walletId;
    int balance ;
    public void AddDeposit(int a ){
        balance+=a;
        System.out.println("total balance : "+balance);
    }
    public void withdraw(int a ){
        System.out.println("balance to withdraw is "+a);
        balance = balance-a;
        System.out.println("remaing balance is  "+balance);
    }
}
public class _5_Crypto {
    static void main() {
        CryptoWallet obj = new CryptoWallet();
    }
}
