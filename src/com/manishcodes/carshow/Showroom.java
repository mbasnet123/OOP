package com.manishcodes.carshow;
import java.util.ArrayList;

public class Showroom {
    public String name;
    public String location;
    public int establishDate;
    public ArrayList<Car> cars;
    public Showroom (String name,String location,int establishDate,ArrayList<Car> cars) {
        this.name=name;
        this.location=location;
        this.establishDate=establishDate;
        this.cars=cars;
    }
    public void display(){
        System.out.println("the name of the showroom is "+name);
        System.out.println("the location of the showroom is "+location);
        System.out.println("the establishDate of the showroom is "+establishDate);
        for (Car car: cars) {
            car.display();
        }
    }

}