package getterSetter;

// we cant access the private variables directly from the main function or outside class so we create getter and setter
// to initialise and get value

class Game{
    private int charger;
    private String cover ;
    public int getCharger(){
        return charger;
    }
    public void setCharger(int value){
        this.charger =value ;
    }
    public String getCover(){
        return cover ;
    }
    public void setCover(String value){
        this.cover =value ;
    }
}
public class program1 {
    static void main(String[] args) {
        Game obj = new Game();
//        obj.charger = 89 ; // we can set value only if charger is public
        obj.setCharger(88);
        System.out.println(obj.getCharger());

        Game obj2 = new Game();
//        obj2.cover = "BGMI"; // we cannot set value if variable  is private
        obj2.setCover("BGMI India");
        System.out.println(obj2.getCover());
    }
}
