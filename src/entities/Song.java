package entities;

public class Song {
    public static int autoId = 0;
    private int id;
    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.id = ++autoId;
        this.name = name;
        this.singer = singer;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Song.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String single) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", single='" + singer + '\'' +
                '}';
    }
}
