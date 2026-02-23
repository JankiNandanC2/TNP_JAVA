package Feb23;
class bank{
    private String accno ;
    private String ifscCode ;
    void getDetais(){
        System.out.println("Account no : "+ accno);
        System.out.println("Ifsc code : "+ifscCode);
    }
    void setDetails(String acc , String iif){
        this.accno = acc ;
        this.ifscCode = iif ;
    }
}
public class encapsultion1 {
    public static void main(String[] args) {
        bank b = new bank();
        b.setDetails("89798550345", "SBIN00109001");
        b.getDetais();
    }
}
