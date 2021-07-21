package com.company;

public class SpeedConverter {

    // Method to convert km/hr to m/hr
    public static void toMilesPerHour(double kilometersPerHour){
        long result = 1L;
        if(kilometersPerHour < 0){
            System.out.println( "Invalid Value");
        }else {
            result = (long)(kilometersPerHour/1.60934d) ;
            System.out.println("Converted " + kilometersPerHour + " km/hr to " + result + " m/hr (Value is rounded " +
                    "down)" );
        }
    }

    // Method to convert m/hr to km/hr
    public static void toKilometersPerHour(double milesPerHour){
        double result = 1d;
        if(milesPerHour < 0){
            System.out.println( "Invalid Value");
        }else {
            result = (milesPerHour*1.60934d) ;
            System.out.println("Converted " + milesPerHour + " m/hr to " + result + " km/hr" );
        }
    }
}

