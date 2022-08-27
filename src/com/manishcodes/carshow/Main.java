package com.manishcodes.carshow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> features = new ArrayList<String>();
        features.add("high mileage");
        features.add("high speed");
        features.add("high power");
        ArrayList<Car> cars=new ArrayList<Car>();
        Car BMW = new Car("bmw", "alpine", "min 1 & max 4", 1945, "red",features);
        cars.add(BMW);
        Showroom noob = new Showroom("noob","kadaghari",1967,cars);
        noob.display();
    }
}