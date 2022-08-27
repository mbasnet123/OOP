package com.manishcodes.carshow;

import java.util.ArrayList;

public class Car {
    public String name;
    public String brand;
    public String gear;
    public int manufacturedDates;
    public String color;
    public ArrayList<String>features;

    public Car(String name,String brand,String gear,int manufacturedDates, String color,ArrayList<String>features){
       this.name=name;
       this.brand=brand;
       this.gear=gear;
       this.manufacturedDates=manufacturedDates;
       this.color=color;
       this.features=features;
    }
    public void display(){
        System.out.println("the name of the car is "+ name);
        System.out.println("the brand of the car is "+brand);
        System.out.println("the gear of the car is "+gear);
        System.out.println("the manufacturedDates of the car is "+manufacturedDates);
        System.out.println("the color of the car is "+color);
        for (String feature:features){
            System.out.println("the features of the car is "+feature);
        }
    }
}
