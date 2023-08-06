package btvn2.entities2;

import java.util.ArrayList;
import btvn2.entities2.General;

public class Team {
    public static int autoId;
    private  int id;
    private String SKT;
    private String G2;

    public Team(String SKT, String g2) {
        this.id = ++autoId;
        this.SKT = SKT;
        G2 = g2;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Team.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public String getSKT() {
        return SKT;
    }

    public void setSKT(String SKT) {
        this.SKT = SKT;
    }

    public String getG2() {
        return G2;
    }

    public void setG2(String g2) {
        G2 = g2;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", SKT='" + SKT + '\'' +
                ", G2='" + G2 + '\'' +
                '}';
    }
}
