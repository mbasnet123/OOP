package com.manishcodes.acess;

public class Access {
    private int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public Access(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
