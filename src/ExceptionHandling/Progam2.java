package ExceptionHandling;

import java.util.Scanner;

public class Progam2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int a = scan.nextInt();
        }catch (Exception m){
            System.out.println(m);
        }
    }
}
