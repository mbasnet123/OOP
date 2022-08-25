package com.manishcodes.staff;

import java.util.ArrayList;

public class Office {
    public String name;
    public String location;
    ArrayList<Staff> staffs;

    public Office(String name, String location, ArrayList<Staff> staffs) {
        this.name = name;
        this.location = location;
        this.staffs = staffs;
    }
        public void output(){
            System.out.println("The name of the Office is " + name);
            System.out.println("The location of the Office is " + location);
            for (Staff staff : staffs) {
                staff.output();
            }
        }
    }
