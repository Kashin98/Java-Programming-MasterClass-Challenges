package com.company;

// Create a method called calcFeetAndInchesToCentimeters
// It needs to have two parameters.
// feet is the first parameter, inches is the 2nd parameter
//
// You should validate that the first parameter feet is >= 0
// You should validate that the 2nd parameter inches is >=0 and <=12
// return -1 from the method if either of the above is not true
//
// If the parameters are valid, then calculate how many centimetres
// comprise the feet and inches passed to this method and return
// that value.
//
// Create a 2nd method of the same name but with only one parameter
// inches is the parameter
// validate that its >=0
// return -1 if it is not true
// But if its valid, then calculate how many feet are in the inches
// and then here is the tricky part
// call the other overloaded method passing the correct feet and inches
// calculated so that it can calculate correctly.
// hints: Use double for your number datatype is probably a good idea
// 1 inch = 2.54cm  and one foot = 12 inches
// use the link I give you to confirm your code is calculating correctly.
// Calling another overloaded method just requires you to use the
// right number of parameters.


public class FeetToCentimeters {
    // Takes feet and inches to calculate centimeters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet>=0) && (inches>=0) && (inches<=12)){
            double toCentimeters = ((feet*12) + inches)*2.54d;
            return toCentimeters;
        }
        System.out.println("Invalid Value");
        return -1;
    }
    /* Takes only inches and calculates it into feet and inches,
    then it calls the previous method inside it to convert to centimeters */
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            // convert to int to remove decimal values
            int feet = (int) (inches/12);
            // store remainder from original value as inches (because 1 feet = 12 inch)
            double remainingInches = inches%12;
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        System.out.println("Invalid Value");
        return -1;
    }
}
