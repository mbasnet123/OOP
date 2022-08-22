package com.manishcodes.cars;

public class Main {
    public static void main(String[] args) {
    Cars lexus = new Cars("lexus", 500, 20, "Petrol", "Red", "Premium");
    lexus.output();
        System.out.println();
        System.out.println();
    Cars ferrari = new Cars("Ferrari", 450, 15, "Petrol", "Silver", "Sports");
    ferrari.output();
    }
}
