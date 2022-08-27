package com.manishcodes.inheritance.singleInheritance;

//... this is a base class ......
public class Room
{
    int length, breadth;
    Room(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int roomArea(){
        return length*breadth;
    }
}
//... this is a derived class ......
class Bedroom extends com.manishcodes.inheritance;
{
    int height;
    Bedroom(int x, int y, int z)
    {
        super(x, y);
        height=z;
    }
    int roomVolume(){
        return length*breadth*height;
    }
}


