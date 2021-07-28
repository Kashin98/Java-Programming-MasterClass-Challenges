package com.company;

public class Cuboid extends Rectangle{
    private double height;

//    Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

//    Getters
    public double getHeight() {
        return height;
    }

//    Class Methods
    public double getVolume(){
        return super.getArea() * this.height;
    }
}
