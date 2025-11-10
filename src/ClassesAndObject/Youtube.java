package ClassesAndObject;

import java.sql.SQLOutput;

class YoutubeChannel {
    String ChannelName ;
    int subscriber ;
    int videos =0 ;
    public void uploadVideo(){
        videos++;
    }
    public void get(){
        System.out.println("video uploaded is : "+videos);
    }
}
public class Youtube {
    static void main() {
        YoutubeChannel obj = new YoutubeChannel();
        obj.uploadVideo();
        obj.uploadVideo();
        obj.uploadVideo();
        obj.get();
    }
}
