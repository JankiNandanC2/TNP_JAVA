package Encapsulaion;

// binding private data member with public member function

class Mobile{
    private boolean powerOn = false ;
    public void pressButton(){
        powerOn = true ;
        System.out.println("Power is on you can use your phone ");
    }
    public void useApp(){
        if(powerOn)
            System.out.println("App is working ");
        else
            System.out.println("power is off , first press button to switch on");
    }
}
public class program1 {
    static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.useApp();
        // call pressButton to use app
        obj.pressButton();
        obj.useApp();
    }
}
