package com.company;

/* Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since numbers are equal up to 3 decimal places.
areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers are not equal up to 3 decimal places
areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers are equal up to 3 decimal places.
NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in
the course. NOTE: Do not add a main method to solution code.
*/

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        /* We just multiple by 1000 to get the 3 values that are in decimal place, then we cast it the int so that the
         values become whole integers instead w/o decimal values and we compare the whole values*/
        int convertedValue1 = (int) (value1*1000);
        int convertedValue2 = (int) (value2*1000);
        if ( convertedValue1 == convertedValue2 ){
            System.out.println(value1 + " = " + value2 +" upto 3 decimal points");
                return true;
        }
        System.out.println(value1 + " != " + value2 +" upto 3 decimal points");
        return false;
    }
    //Shorter method: Do calculations inside if condition expression:
    /*if ( (value1*1000) == (value2%*1000) ){
        return true;
    }
        return false;*/
}
