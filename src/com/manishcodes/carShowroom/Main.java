package com.manishcodes.carShowroom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> features = new ArrayList<String>();
        features.add("Long_range");
        features.add("Sexy");
        features.add("Top_speed");
        features.add("efficient");
        Car tesla = new Car("Tesla Model 3", 150, "Electric", features, "Black");
        features.clear();
        features.add("Exhaust");
        features.add("Top_acceleration");
        features.add("Loud-noise");
        features.add("Beautiful");
        Car Rover = new Car("Range-Rover", 200, "Diesel", features, "White");
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(tesla);

        Carshowroom Kings = new Carshowroom("KingCar", "Lagankhel", cars);
        Kings.output();
        System.out.println();
        cars.clear();
        cars.add(Rover);
        Carshowroom Queens = new Carshowroom("QueensCar","Bhaisepati", cars);
        Queens.output();
    }

}

