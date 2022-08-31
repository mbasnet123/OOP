package com.manishcodes.classinheritance;

public class Employee extends Person {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String name, int age, String address, String position) {
        super(name, age, address);
        this.position = position;
    }

//    @override
    public void display() {
        super.display();
        System.out.println("the position is "+position);
    }
}
