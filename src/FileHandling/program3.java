package FileHandling;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program3 {
    public static void main(String[] args) {
        String fileName = "hello.txt";
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
        try{
            BufferedReader r = new BufferedReader(new FileReader(file));
            String line ;
            while((line=r.readLine()) != null){
                System.out.println(line);
            }
//            r.readLine();
        }catch (IOException e){
            System.out.println("cannot read "+e.getMessage());
        }
    }
}
