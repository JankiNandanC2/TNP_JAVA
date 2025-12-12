package FileHandling;
import java.io.File ;
import java.io.IOException;
public class program1 {
    public  static void main(String[] args) {
        String fileName = "college.txt";
        File file = new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("FIle "+file.getName()+"created");
            }
            else
                System.out.println("file"+file.getName()+"created");
        }catch(IOException m){
            System.out.println("error occured"+m.getMessage());
            m.printStackTrace();
        }

    }
}
