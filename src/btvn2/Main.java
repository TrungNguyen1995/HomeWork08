package btvn2;

import btvn2.entities2.General;
import btvn2.entities2.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        SummonRiftService summonRiftService = new SummonRiftService();
        System.out.println("Mời bạn nhập số thành viên muốn thêm vào");
        int n = Integer.parseInt(scanner.nextLine());
        SummonRiftService summonRiftService1 = new SummonRiftService();
        ArrayList <Team> teams = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            Team team = summonRiftService.createdTeam(scanner);
            teams.add(team);
        }
        System.out.println("Danh sách thành viên 2 team là:"+teams);
        System.out.println("Mời bạn nhập vào số tướng của 2 teams");
        int m = Integer.parseInt(scanner.nextLine());
        ArrayList <General> generals = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            General general = summonRiftService.createdGeneral(scanner);
            generals.add(general);
        }
        System.out.println("Danh Sách Tướng 2 teams sử dụng là"+generals);
    }
}
