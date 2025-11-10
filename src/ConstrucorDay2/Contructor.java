package ConstrucorDay2;

import javax.lang.model.element.Name;

class employee {
    String name ;
    int salary ;
    String eId ;
    void print(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(eId);
    }
    employee(){
        System.out.println("welcome to employee database");
        this.name = "rana sittu";
        this.salary =100000;
        this.eId = "0289821382jfadf";
        print();
    }
    employee(String Name , int Salary , String E_id){
        this.name = Name ;
        this.salary =Salary;
        this.eId =E_id ;
        this.print();
    }
    employee(employee em){
        this.name= em.name ;
        this.salary = em.salary;
        this.eId = em.eId;
        this.print();
    }
}
public class Contructor {
    static void main(String[] args) {
        employee obj1 = new employee();
        employee obj2 = new employee("Janki Nandan",999999,"0157cy231052");
        employee obj3 = new employee(obj2);
    }
}
