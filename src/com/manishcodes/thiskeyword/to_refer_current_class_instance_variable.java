package com.manishcodes.thiskeyword;

class Student{
    int rn;
    String name;
    float fees;
    Student(int rn,String name,float fees){
        this.rn=rn;
        this.name=name;
        this.fees=fees;
    }
    void display(){ System.out.println(rn+" "+name+" "+fees); }
}
class to_refer_current_class_instance_variable{
    public static void main(String args[]){
        Student s1=new Student(111,"harendra",5000f);
        Student s2=new Student(112,"mahesh",6000f);
        s1.display();
        s2.display();
    }}