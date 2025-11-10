package ClassesAndObject;

import java.util.Scanner;

class ShoppingCart{
    String productName ;
    int quantity ;
    double price;
    public void set(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name , quantity , price");
        productName=scan.nextLine();
        quantity = scan.nextInt();
        price=scan.nextDouble();
    }
    public void totalCost(){
        System.out.println("product name is :"+productName);
        double cost = quantity*price;
        System.out.println("total cst is "+cost);
    }
}
public class _3_ecmmerce {
    static void main() {
        ShoppingCart obj = new ShoppingCart();
        obj.set();
        obj.totalCost();
    }
}
