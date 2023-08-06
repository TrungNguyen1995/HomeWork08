package btvn2;

import btvn2.entities2.General;
import btvn2.entities2.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {
    public Team createdTeam(Scanner scanner) {
        System.out.println("Mời bạn nhập tên thành viên SKT");
        String SKT = scanner.nextLine();
        System.out.println("Mời bạn nhập tên thành viên G2");
        String G2 = scanner.nextLine();
        return  new Team(SKT,G2);
    }
        public General createdGeneral (Scanner scanner) {
                System.out.println("Moi ban nhap ten tuong");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap vi tri cua tuong");
        String poisition = scanner.nextLine();
        return new General(name,poisition);
    }
}