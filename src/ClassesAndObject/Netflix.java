package ClassesAndObject;

import java.util.Scanner;

class NetflixShow{
    int episode ;
    float rating ;
    int count = 0 ;
    public void watchEpisode(){
        episode-=1;
        count++;
        System.out.println("remaining episode is "+episode);
        System.out.println("No of episode watched is "+count);
    }
}
public class Netflix {
    static void main() {
        Scanner scan = new Scanner(System.in);
        NetflixShow obj = new NetflixShow();
        System.out.println("Enter no of episode and rating");
        obj.episode=scan.nextInt();
        obj.rating = scan.nextFloat();
        obj.watchEpisode();
        obj.watchEpisode();
        obj.watchEpisode();
        obj.watchEpisode();
        obj.watchEpisode();
    }
}
