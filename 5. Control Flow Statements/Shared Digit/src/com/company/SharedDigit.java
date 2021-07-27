package com.company;

/*Shared Digit
        Write a method named hasSharedDigit with two parameters of type int.

        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
        If one of the numbers is not within the range, the method should return false.

        The method should return true if there is a digit that appears in both numbers,
        such as 2 in 12 and 23; otherwise, the method should return false.



        EXAMPLE INPUT/OUTPUT:

        hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

        hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

        hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers



        NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

        NOTE: Do not add a main method to the solution code.*/

public class SharedDigit {
    /*Algorithm (First Draft, may not be perfect)
    * First take two input values and check whether they lie between 10 - 99, return false if they don't.
    * Take the last digit of both num1 and num2 using num % 10
    * then find firstDigit of both num1 and num2 using num /10
    * Check if lastDigitNum1 matches either first or last of Num2, if not check same thing but with firstDigitNum1
    * Return true if any of values match in any way else return false
    * */

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10) || (num1 >99) || (num2 <10) || (num2 >99)){
            return false;
        }
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        int firstDigitNum1 = num1 / 10;
        int firstDigitNum2 = num2 / 10;

        if(lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == firstDigitNum2 || firstDigitNum1 == lastDigitNum2 || firstDigitNum1 == firstDigitNum2){
            return true;
        }
        return false;
    }
}
