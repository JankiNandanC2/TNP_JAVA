package ExceptionHandling;

import java.util.Scanner;

public class Program4_cw {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter size of array : ");
            int n = scan.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array : ");
            for(int i = 0 ; i<=n ; i++){
                arr[i]= scan.nextInt();
            }
        }catch (Exception m){
            System.out.println(m);
        }finally{   // used to display some default message as it this block will always run
            System.out.println("the code inside finally block will always run whether exception is there or not ");
        }

        // throw is a keyword in java

    }
}
