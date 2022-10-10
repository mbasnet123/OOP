package com.manishcodes.acess;

public class ObjectClass {

    int num;
    public ObjectClass(int num){
        this.num = num;
    }
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(3);
        ObjectClass obj2 = new ObjectClass(35);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
