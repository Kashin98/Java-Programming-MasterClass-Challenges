package com.company;

public class Circle {
    private double radius;

//    Constructor
    public Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        }else {
            this.radius = radius;
        }
    }

//    Getter
    public double getRadius() {
        return this.radius;
    }

//    Class Method
    public double getArea(){
        return Math.PI * Math.pow( radius, 2);
    }
}
