package METHODS;

import java.util.Scanner;

public class SecondLargest {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        printSecondLargest(a, b ,c);
    }

    private static void printSecondLargest(int a, int b, int c) {
        if(a>b && a>c){
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
        else if(b>a && b>c){
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }
        else if(c>a && c>b){
            if(b>a) System.out.println(b);
            else System.out.println(a);
        }
    }
}
