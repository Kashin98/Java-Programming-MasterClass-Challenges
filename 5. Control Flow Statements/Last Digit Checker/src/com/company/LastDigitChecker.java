package com.company;
/*

Last Digit Checker
        Write a method named hasSameLastDigit with three parameters of type int.

        Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
        If one of the numbers is not within the range, the method should return false.

        The method should return true if at least two of the numbers share the same rightmost digit;
        otherwise, it should return false.


        EXAMPLE INPUT/OUTPUT:

        hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
        hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
        hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000


        Write another method named isValid with one parameter of type int.

        The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
        otherwise return false.

        EXAMPLE INPUT/OUTPUT

        isValid(10); → should return true since 10 is within the range of 10-1000
        isValid(468); → should return true since 468 is within the range of 10-1000
        isValid(1051); → should return false since 1051 is not within the range of 10-1000


        NOTE: All methods need to be defined as public static as we have been doing so far in the course.
        NOTE: Do not add a main method to the solution code.
*/

public class LastDigitChecker {
    /* Algorithm
    * Test all 3 inputs to see if they lie between 10 to 1000, return false if not
    * since only rightmost digit (lastDigit) is necessary that means we only need to check for lastDigit of each
      value.
    * Take all the lastDigits of the given values using n % 10
    * Check if lastDNum1 == lastDNum2 or lastDNum2 == lastDNum3 or lastDNum3 == lastDNum1
    * return true if it matches, else return false
    * */

//    Check value is between 10 to 1000
    public static boolean isValid(int n){
        return n>= 10 && n <= 1000;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(!isValid(n1) || !isValid(n2) || !isValid(n3)){
            return false;
        }
        int x = n1 % 10;  // lastDigitNum1
        int y = n2 % 10;  // lastDigitNum2
        int z = n3 % 10;  // lastDigitNum3
        if (x==y || y==z || z==x){
            return true;
        }
        return false;
    }
}
