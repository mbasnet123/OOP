package com.manishcodes.Basics;

public class Variables {
    int a = 2; //instance variable
    static int b = 5; //static variable

    static int x = 6; //static variable. it has global scope
    public void fun(){
        int y = 5; // local variable. has local scope
        System.out.println(x+" "+y); // first x = 6 and y = 5
        x++; // then x increases by 1 and becomes 7
        y++; // y increases by 1 and becomes 6
    }

    public static void main(String[] args) {
        int c = 4;
        System.out.println(c);
        System.out.println(Variables.b);
        Variables ref = new Variables();
        System.out.println(ref.a);

        Variables def = new Variables();
        def.fun(); // x = 6 and y =

        // x and y are incremented by 1. x is static, so has global scope and x = 7 but y is local variable. it's memory is destroyed and y = 5
        def.fun();
    }
}
