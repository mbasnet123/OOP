package com.manishcodes.cars;

public class Cars {
    String name;
    int weight;
    int fuel_capacity;
    String engine;
    String color;
    String luxury;

    public Cars(String name, int weight, int fuel_capacity, String engine, String color, String luxury) {
        this.name = name;
        this.weight = weight;
        this.fuel_capacity = fuel_capacity;
        this.engine = engine;
        this.color = color;
        this.luxury = luxury;
    }

    public void output(){
        System.out.println("The name of the car is " + name);
        System.out.println("The weight of the car is " + weight);
        System.out.println("The fuel_capacity of the car is " + fuel_capacity);
        System.out.println("The engine of the car is " + engine);
        System.out.println("The color of the car is " + color);
        System.out.println("The luxury of the car is " + luxury);
    }
}