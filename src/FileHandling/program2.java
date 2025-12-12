package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class program2 {
    public static void main(String[] args) {
        String nam ="abc.txt";
        File file = new File(nam);
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
        try {
            FileWriter writers = new FileWriter(nam);
            writers.write(" Name : Jankinandnan\n enrl no = 0157cy2310552");
            writers.write(" Name : ranasitu\n enrl no = 0157cy2310552");
            writers.close();
            System.out.println("data updaed");
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("cannot update data "+e.getMessage());
        }
    }
}
