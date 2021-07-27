package com.company;
/*
Greatest Common Divisor
        Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

        If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

        The method should return the greatest common divisor of the two numbers (int).

        The greatest common divisor is the largest positive integer that can fully divide each of the integers
        (i.e. without leaving a remainder).



        For example 12 and 30:

        12 can be divided by 1, 2, 3, 4, 6, 12

        30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

        The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.



        EXAMPLE INPUT/OUTPUT:

        getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
        getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
        getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
        getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder


        NOTE: The method getGreatestCommonDivisor should be defined as public static like we have been doing so far
        in the course.*/

public class GreatestCommonDenominator {
    /*Algorithm

    * Take two inputs and check if either are <10, return -1 if they are
    * If not, find out which value is lowest, num1 or num2
    * Then run a loop and make condition to stop if it reaches the value of lowest num (since the divisor can not be
      greater than the lowest number given)
    * inside loop check which iterable value from 0 to lowest num returns 0 remainder for both num1 and num2 when
      divided by that iterable value.
    * if any number hits it assign it to new variable GCD and continue loop
    * If a new divisor is found then the new divisor is assigned to variable GCD replacing previous value.
    * continue till the final iteration to get the greatest common divisor;
    * return the value after loop is over.
    * */

    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10){
            return -1;
        }
//        Returns lowest number of given 2 numbers
        int lowestNum = Math.min(num1, num2);
        int GCD = 0;
        for (int i = 1; i <= lowestNum; i++){
            if(num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
        }
        return GCD;
    }
}

