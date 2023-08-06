import entities.Follower;
import entities.Idol;
import entities.Song;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng idol");
        int n = Integer.parseInt(scanner.nextLine());
        TiktokService tiktokService = new TiktokService();
        ArrayList <Idol> tiktoks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Idol idol = tiktokService.createdIdol(scanner);
            tiktoks.add(idol);
        }
        System.out.println("Thông tin idol Tiktok: "+tiktoks);
        System.out.println("Mời bạn nhập số lượng bài hát của idol");
        int m = Integer.parseInt(scanner.nextLine());
        ArrayList <Song> songs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Song song = tiktokService.createdSongs(scanner);
            songs.add(song);
        }
        System.out.println("Thông tin bài hát của Idol tik tok là:"+songs);

        ArrayList <Follower> followers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Follower follower = tiktokService.createdFollower(scanner);
            followers.add(follower);
        }
        System.out.println("Thong tin nguoi ham mo la: "+followers);
    }
}