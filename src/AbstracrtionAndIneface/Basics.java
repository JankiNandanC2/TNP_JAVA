package AbstracrtionAndIneface;
abstract class mobile{
    int charger;
    int data ;
    abstract void camera();
    abstract void instagram();
}

class human extends mobile{
    public void instagram(){

    }
    public void camera() {
        System.out.println("hell0");
    }
}

public class Basics {
    static void main(String[] args) {
        mobile obj = new human();

    }
}
