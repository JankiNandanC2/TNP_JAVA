package ExceptionHandling;

import java.util.Scanner;

// something that crashes the normal flow of code

public class Progam2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("enter int input : ");// but give string as input to create exception
            int a = scan.nextInt();
        }catch (Exception m){
            System.out.println(m);
            System.out.println(m.getMessage());
        }
    }
}
