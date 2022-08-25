package com.manishcodes.carShowroom;

import java.util.ArrayList;

public class Carshowroom{
    public String name;
    public String location;
    public ArrayList<Car> cars;


    //    parameterized constructors
    public Carshowroom(String name, String location, ArrayList<Car> cars) {
        this.name = name;
        this.location = location;
        this.cars = cars;
    }

    public void output() {
        System.out.println("The name of the showroom is " + name);
        System.out.println("The location of the showroom is " + location);
        for (Car car : cars) {
            car.output();
        }
    }
}