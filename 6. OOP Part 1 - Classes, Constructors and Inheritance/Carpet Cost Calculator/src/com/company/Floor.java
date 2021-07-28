package com.company;

public class Floor {
    private double width;
    private double length;

//    Constructors
    public Floor(double width, double length) {
        if(width < 0){
            this.width = 0;
        }
        else if(length < 0){
            this.length = 0;
        }
        else {
            this.width = width;
            this.length = length;
        }
    }

//    Only getters from width and length
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
