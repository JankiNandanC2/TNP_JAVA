package Feb23;

import java.util.Scanner;

// its need to be fixed

class Login{
    private final String userId ;
    String emailId ;
    String password ="";
    int attemptCount = 0 ;
    boolean accBlocked = false  ;
    boolean validMail = false  ;
    boolean validPswd  = false ;
    boolean loginStatus = false ;

    Login(String uid , String email , String pswd ) {
        this.userId = uid;
        setEmailId(email);
        setPassword(pswd);
    }

    void setEmailId(String e){
        if(e.matches(".*[@].*") && e != null){
            this.validMail = true ;
            this.emailId = e ;
        }
        else {
            System.err.println("INVALID EMAILS ID ");
            this.validMail = false;
        }

    }
    void setPassword(String p){
        boolean isCurrentValid = true ;
        if( p.length()<8 || p==null ) isCurrentValid = false ;
        if( ! p.matches( ".*[a-z].*")) isCurrentValid = false  ;
        if( ! p.matches(".*[A-Z].*")) isCurrentValid =  false ;
        if( ! p.matches(".*[0-9].*")) isCurrentValid = false ;
        if( ! p.matches(".*[^a-zA-Z0-9].*"))isCurrentValid = false ;
        if(isCurrentValid) {
            validPswd = true ;
            this.password = p;
        }
        else {
            this.validPswd = false ;
            this.password="";
            System.out.println("INVALID PSWD: Must be 8+ chars, with Uppercase, Lowercase, Digit, and Special Symbol.");
        }
    }

    void loginAttempt(String pswdentered){
        if(accBlocked) {
            System.out.println("account is blocked");
            return ;
        }
        if(! validPswd)   {
            System.err.println("No valid Password is configured for this account  ");
            return;
        }
        if( password.equals(pswdentered)){
            System.out.println("login successFully");
            loginStatus = true ;
        }
        else {
            attemptCount++;
            System.err.println("WRONG PASSWORD") ;
            if(attemptCount>3) {
                accBlocked = true ;
                System.out.println("Account Blocked ! Try after 24 hours  ");
            }
        }
    }
}
public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Login l = new Login("USER77" , "rana34@gmail.com","Ahjgjhas8272!2") ;
       while(true){
           System.out.println("enter pswd : ");
           String p = scan.next();
           l.loginAttempt(p);
           if(l.accBlocked) break;
           if(l.loginStatus) break;
       }
    }
}
