package com.company;

public class Rectangle {
    private double width;
    private double length;

//     Constructors
    public Rectangle(double width, double length) {
        if(width >= 0 && length >= 0){
            this.width = width;
            this.length = length;
        }
        if (width < 0){
            this.width = 0;
            this.length = length;
        }
        if ( length < 0){
            this.length = 0;
            this.width = width;
        }
        if ( length < 0 && width < 0){
            this.length = 0;
            this.width = 0;
        }
    }

//    Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

//    Class Methods
    public double getArea(){
        return width * length;
    }
}
