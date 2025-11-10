package METHODS;
import java.util.Scanner;
public class passwordSrengthChecker {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean a = HasUpperCase(str);
        boolean b = hasLowerCase(str);
        boolean c = HasDigit(str);
        boolean d = hasSpecialChar(str);
        int score = 0;
        if(a) score++; if(b) score++; if(c) score++; if(d) score++;
        switch(score){
            case 0:
                System.out.println("worst");
                break;
            case 1:
                System.out.println("average");
                break;
            case 2:
                System.out.println("good");
                break;
            case 3:
                System.out.println("excellent");
                break;
            case 4:
                System.out.println("strong");
                break;
            default:
                System.out.println("try again ");
        }
    }
    boolean flag = false ;
    private static boolean hasSpecialChar(String str) {
        boolean flag = false ;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetterOrDigit(str.charAt(i))){
               flag = true;
            }
        }
        return true ;
    }

    private static boolean HasDigit(String str) {
        boolean flag = false ;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                flag = true;
            }
        }
        return flag ;
    }

    private static boolean hasLowerCase(String str) {
        boolean flag = false ;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLowerCase(str.charAt(i))){
                flag = true;
            }
        }
        return flag ;
    }

    private static boolean HasUpperCase(String str) {
        boolean flag = false ;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                flag = true;
            }
        }
        return flag ;
    }
}
