package com.company;

public class Main {

    public static void main(String[] args) {
        // with feet and inches parameters
        System.out.println(FeetToCentimeters.calcFeetAndInchesToCentimeters(5,11) + " cm");
        // with only inches parameter
        System.out.println(FeetToCentimeters.calcFeetAndInchesToCentimeters(114) + " cm");
    }
}
