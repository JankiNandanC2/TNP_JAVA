package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

// throws -- we declare it in method to , throw the exception

class demo{
    void read() throws IOException{
        FileReader fr = new FileReader("example file");
        fr.read();
        fr.close();
    }
}
public class Program7ThrowsKeyWrd {
    static void main(String[] args) {
        demo obj = new demo();
//        obj.read(); // unchecked exception -- java: unreported exception java.io.IOException; must be caught or declared to be thrown
        try{
            obj.read();
        }catch (IOException e){
            System.out.println("FIle not find : "+e.getMessage());
        }
    }
}
