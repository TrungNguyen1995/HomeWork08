import entities.Follower;
import entities.Idol;
import entities.Song;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TiktokService {
    public Idol createdIdol(Scanner scanner){
        System.out.println("Mời bạn nhập tên idol Tiktok");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập địa chỉ email");
        String email = scanner.nextLine();
        System.out.println("Số lượng người theo dõi Idol là:");
        ArrayList <Integer> followers = new ArrayList<>(Arrays.asList(20000));
        System.out.println(followers);
        System.out.println("Mời bạn nhập tên Group hâm mộ Idol");
        String group = scanner.nextLine();
        return  new Idol(name,email,followers,group);
    }
    public Follower createdFollower (Scanner scanner){
        System.out.println("Mời bạn nhập tên người hâm mộ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập địa chỉ email");
        String email = scanner.nextLine();
        System.out.println("Mời bạn nhập số lượng like của người hâm mộ");
        int numberOflike = Integer.parseInt(scanner.nextLine());
        return  new Follower(name,email,numberOflike);
    }
    public Song createdSongs (Scanner scanner){
        System.out.println("Mời bạn nhập tên ca sĩ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập tên bài hát");
        String singer = scanner.nextLine();
        return new Song(name,singer);
    }
}
