package btvn2;

import btvn2.entities2.Team;

import java.util.ArrayList;

public class SummonRift {
    public static int autoId;
    private  int id;
    private ArrayList <Team> teams;

    public SummonRift(ArrayList<Team> teams) {
        this.id = ++autoId;
        this.teams = teams;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        SummonRift.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "id=" + id +
                ", teams=" + teams +
                '}';
    }
}
