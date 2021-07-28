package com.company;

public class Floor {
    private double width;
    private double length;

//    Constructors
    public Floor(double width, double length) {
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


//    Class Methods
    public double getArea(){
        return width * length;
    }
}
