package com.manishcodes.Basics;

public class MainMethod {

    //it is non-static method and a object has to be created to call it
    public void fun(){
        System.out.println("it is non-static method");
    };

    //it is static method and can be called through class name
    public static void function(){
        System.out.println("it is static method");
    }
    public static void main(String[] args) {
        MainMethod.function();
        MainMethod ref = new MainMethod();
        ref.fun();
    }
}
