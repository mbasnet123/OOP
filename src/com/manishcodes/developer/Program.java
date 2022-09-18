package com.manishcodes.developer;

public class Program {
    public static void main(String[] args) {
        Developer manish = new Developer("ios", "Binit", 5);
        manish.display();
        System.out.println();
        Developer sunil = new Developer("android", "manish", 7);
        sunil.display();
    }
}
