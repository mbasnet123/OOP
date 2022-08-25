package com.manishcodes.staff;

import java.util.ArrayList;

public class Staff {
    public String name;
    public String department;
    public int salary;
    public ArrayList<String> strengths;

    public Staff(String name, String department, int salary, ArrayList<String> strengths){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.strengths = strengths;
    }

    public void output(){
        System.out.println("The name of the staff is "+ name);
        System.out.println("The Department of the staff is "+ department);
        System.out.println("The salary of the staff is "+ salary);
        for(String strength: strengths){
            System.out.println("The strength of the staff is "+ strength);
        }
    }
}
