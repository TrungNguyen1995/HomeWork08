import entities.Song;

import java.util.ArrayList;
import  entities.Follower;
import entities.Song;
import entities.Idol;

public class Tiktok {
    private ArrayList <Tiktok> Tiktoks;
    private  ArrayList <Song> Songs;

    public Tiktok(ArrayList<Tiktok> tiktoks, ArrayList<Song> songs) {
        Tiktoks = tiktoks;
        Songs = songs;
    }

    public ArrayList<Tiktok> getTiktoks() {
        return Tiktoks;
    }

    public void setTiktoks(ArrayList<Tiktok> tiktoks) {
        Tiktoks = tiktoks;
    }

    public ArrayList<Song> getSongs() {
        return Songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        Songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "Tiktoks=" + Tiktoks +
                ", Songs=" + Songs +
                '}';
    }
}
