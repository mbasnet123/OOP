package com.manishcodes.classinheritance;

public class Student extends  Person {
    private String myClass;
    private String course;

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public Student(String name, int age, String address, String myClass, String course) {
        super(name, age, address);
        this.myClass = myClass;
        this.course = course;
    }

    public void display() {
        super.display();
        System.out.println("The class is "+myClass);
        System.out.println("The course name is "+course);
    }
}
