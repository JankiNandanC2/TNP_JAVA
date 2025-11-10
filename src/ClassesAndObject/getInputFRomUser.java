package ClassesAndObject;

import javax.xml.namespace.QName;
import java.util.Scanner;

class Employee{
    String id ;
    String Name ;
    float salary ;
    public void set(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name , id , salary ");
        Name = scan.nextLine();
        id=scan.nextLine();
        salary =scan.nextFloat();
    }
    public void get(){
        System.out.println("name is :"+ Name);
        System.out.println("Id is :"+id);
        System.out.println("Salary is :"+salary);
    }

}
public class getInputFRomUser {
    static void main() {
        Scanner scan = new Scanner(System.in);
        Employee obj = new Employee();
//        // take input
//        obj.set();
        obj.Name = scan.nextLine();
        obj.id=scan.next();
        obj.salary =scan.nextFloat();

        // print output
        obj.get();
    }
}
