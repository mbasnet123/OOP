package com.manishcodes.City;

public class City {
    String name;
    int population;
    String famous_for;
    String cuisine;
    String landmarks;

    public City(String name, int population, String famous_for, String cuisine, String landmarks){
        this.name = name;
        this.population = population;
        this.famous_for = famous_for;
        this.cuisine = cuisine;
        this.landmarks = landmarks;
    }

    public void output(){
        System.out.println("The name of the city is "+ name);
        System.out.println("The population of the city is "+ population);
        System.out.println("The famous_for of the city is "+ famous_for);
        System.out.println("The cuisine of the city is "+ cuisine);
        System.out.println("The landmarks of the city is "+ landmarks);
    }
}
