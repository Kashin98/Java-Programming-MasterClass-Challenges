package com.company;

/* ---
** Please read this entire page before attempting to solve this coding exercise.
* Additional help is available by watching the video mentioned at the bottom of the page **
---

Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle. */

public class AreaCalculator {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    // Calculate Circle Area
    public static double area(double radius){
        if(radius>0){
           return Math.PI * Math.pow(radius,2);
        }
        System.out.println(INVALID_VALUE_MESSAGE);
        return -1;
    }

    // Calculate Rectangle Area
    public static double area (double x, double y){
        if (x>0 && y>0){
            return x * y;
        }
        System.out.println(INVALID_VALUE_MESSAGE);
        return -1;
    }
}
