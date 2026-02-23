package Feb23;

import java.util.Scanner;

// its need to be fixed

class Login{
    private final String userId ;
    String emailId ;
    String password ;
    int attemptCount = 0 ;
    boolean accBlocked ;
    boolean validMail ;
    boolean validPswd ;
    Login(String uid , String email , String pswd ) {
        this.validMail = true ;
        this.validPswd = true ;
        this.userId = uid;
        this.accBlocked = false ;
        setEmailId(email);
        setPassword(pswd);
    }
    void setEmailId(String e){
        if(e.matches(".*[@].*")){
            validMail = true ;
            this.emailId = e ;
        }
    }
    void setPassword(String p){
        if( p.length()<8) validPswd = false ;
        if( ! p.matches( ".*[a-z].*")) validPswd = false  ;
        if( ! p.matches(".*[A-Z].*")) validPswd =  false ;
        if( ! p.matches(".*[0-9].*")) validPswd = false ;
        if( ! p.matches(".*[^a-zA-Z0-9].*"))validPswd = false ;
        if(validPswd) this.password = p ;
        else System.out.println("INVALID PSWD");
    }

    void loginAttempt(String pswdentered){
        if(! validPswd)   {
            attemptCount++;
            System.err.println("INVALID PASSWORD");
        }
        if(! validMail)  {
            attemptCount++ ;
            System.err.println("INVALID EMAILS ID ");
        }
        if(! password.equals(pswdentered)){
            attemptCount++;
            System.err.println("WRONG PASSWORD");
        }
        if(attemptCount>=3) accBlocked = true ;
        if(accBlocked) System.out.println("account is blocked");
        else System.out.println("login successFully");
    }

}
public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Login l = new Login("USER77" , "rana34@gmail.com","Ahjgjhas8272!2") ;
        System.out.println("enter pswd : ");
        String p = scan.next();
        l.loginAttempt(p);
    }
}
