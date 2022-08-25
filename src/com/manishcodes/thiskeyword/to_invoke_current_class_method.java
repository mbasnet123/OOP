package com.manishcodes.thiskeyword;

    class ThisMethod{
        void m(){System.out.println("hello m");}
        void n(){
            System.out.println("hello n");
//m();//same as this.m()
            this.m();
        }
    }
    class to_invoke_current_class_method{
        public static void main(String args[]){
            ThisMethod a=new ThisMethod ();
            a.n();
        }}
