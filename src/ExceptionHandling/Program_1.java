package ExceptionHandling;
/*
exception is a disruption/out of expected range encountered during the run time
exception stops the normal flow of the code -- sudden failure

 types of exception  :-
                       1 checked exception - at compile time [eg - sql exception -- error are given at compile time ]
                       2 unchecked exception - at run time  [eg - arithmetic exception ]
                       3 errors - it comes at compile time [semicolon missed , not declared a variable ]

        * errors comes at compile time whereas exception comes at both compile and run time
        * errors comes at any syntax error whereas exception cannot
        * we cannot run the code with error, but we can run the code with exception


*/
public class Program_1 {
    static void main(String[] args) {
//        int a = 10 ;
//        int b = 0 ;
//        int c = a/b ;
        try{
            int a = 10 ;
            int b = 0 ;
            int c = a/b ;
        }catch (Exception t ){
            System.out.print("you cannot divide a number by zero because : ");
            System.out.println(t); // object 't' tells the particular exception occurring in try block
            System.out.println(t.getMessage()); // gives particular error
        }
        System.out.println();
        try{
            //  java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
            int[] arr ={1,2,3,4};
            arr[5] = 44 ;
        }catch (Exception u){
            System.out.println(u);
        }

    }
}
