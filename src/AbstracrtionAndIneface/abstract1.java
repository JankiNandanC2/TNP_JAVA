package AbstracrtionAndIneface;

abstract class Employee{
    String name ;
    String id ;
    int baseSalary ;
    Employee(String nam , String ID , int sal){
        this.name = nam ;
        this.id = ID ;
        this.baseSalary = sal ;
    }
    void displayInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(baseSalary);
    }
}
class Manager extends Employee{
    int bonous ;
    Manager(String Name , String ID , int sal , int bonous ){
        super(Name, ID , sal ) ;
        this.bonous  = bonous ;
    }
}
class Programmer extends Employee{
    int overTimeRate ;
    Programmer(String Name , String ID , int sal){
        super(Name, ID , sal) ;
    }
}
public class abstract1 {
    public static void main(String[] args) {
        Manager mg = new Manager("harish" , "emp220",88908 ,9999) ;
        mg.displayInfo();
        Programmer pg = new Programmer("Ravi" , "emp30300" , 99739);
        pg.displayInfo();
    }
}
