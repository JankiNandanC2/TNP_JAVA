package METHODS;

import java.util.Scanner;

public class BASICS {
    private static int dice() {
        return (int) (Math.random()*6);
    }

    //without return type and without parameter
//    public static void printName(){
//        System.out.println("Janki Nandan");
//    }

//    // without parameter and with return type
//    public static String printName(){
//        Scanner scan = new Scanner(System.in);
//        String a =scan.nextLine();
//        return a ;
//    }
//
    // with parameter and without return Type
    /*
    public static void print(int x){
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

     */

    public static void pattern(int x){
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < x-i-1; j++) {
                System.out.print("_");
            }
            for (int j = 0; j<= i; j++) {
//                System.out.print(j+" ");
                System.out.print((char)(j+65)+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        printName();
//        int a = dice() ;
//        System.out.println(a);
//        String str = printName();
//        System.out.println(str);

        // type 3  with parameter and without return type
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        print(n);
        pattern(n);
    }

}
