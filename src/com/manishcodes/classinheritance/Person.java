package com.manishcodes.classinheritance;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("the name is "+name);
        System.out.println("the age is "+age);
        System.out.println("the address is "+address);
    }
}