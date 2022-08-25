package com.manishcodes.carShowroom;

import java.util.ArrayList;

public class Car {
    public String brand;
    public int priceInThousand;
    public String engine;
    public ArrayList<String> features;
    public String color;

    public Car(String brand, int priceInThousand, String engine, ArrayList<String> features, String color){
        this.brand = brand;
        this.priceInThousand = priceInThousand;
        this.engine = engine;
        this.features = features;
        this.color = color;
        }

        public void output(){
            System.out.println("The brand of the car is "+brand);
            System.out.println("The price of the car is "+priceInThousand);
            System.out.println("The engine of the car is "+engine);
            for(String feature: features){
                System.out.println("The features of the car is "+ feature);
            }
            System.out.println("The color of the car is "+color);
    }
}
