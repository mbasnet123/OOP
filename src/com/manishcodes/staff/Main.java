package com.manishcodes.staff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strengths = new ArrayList<String>();
        strengths.add("Versatile");
        strengths.add("Confident");
        strengths.add("Team_Player");
        Staff manish = new Staff("Manish", "IT", 50000, strengths);
        strengths.clear();
        strengths.add("Discipined");
        strengths.add("Confident");
        strengths.add("Team_Player");
        Staff rajesh = new Staff("Rajesh", "Finance", 70000, strengths);
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        staffs.add(rajesh);

        Office dwit = new Office("DWIT", "City", staffs);
        dwit.output();
        System.out.println();
        staffs.clear();
        staffs.add(manish);
        Office leapfrog = new Office("Leapfrog", "Dhapasi", staffs);
        leapfrog.output();
    }
}
