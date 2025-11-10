package ConstrucorDay2;
class TournamentPlayer{
    String Name ;
    int score ;
    TournamentPlayer(String name){
        this("Rohit Sharma",264);
    }
    TournamentPlayer(String name  , int score){
        Object ob;
//        this(ob);
        this.Name=name;
        this.score=score;
        leaderBoard();
    }
    TournamentPlayer(TournamentPlayer tp){
        this.Name= "Virat Kohli";
        this.score=199;
        leaderBoard();
    }
    public void leaderBoard(){
        System.out.println("Player name : "+Name+" score is : "+score);
    }
}
public class Program1 {
    static void main(String[] args) {
        TournamentPlayer obj = new TournamentPlayer("MS Dhoni");
//        TournamentPlayer obj2= new TournamentPlayer(obj);
    }
}
