package entities;

public class Follower {
    public static int autoId = 0;
    private String name;
    private int id;
    private String email;
    private int numberOflike;

    public Follower(String name, String email, int numberOflike) {
        this.id = ++autoId;
        this.name = name;
        this.email = email;
        this.numberOflike = numberOflike;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Follower.autoId = autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOflike() {
        return numberOflike;
    }

    public void setNumberOflike(int numberOflike) {
        this.numberOflike = numberOflike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", numberOflike=" + numberOflike +
                '}';
    }
}
