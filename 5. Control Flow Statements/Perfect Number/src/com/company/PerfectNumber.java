package com.company;

/*Perfect Number
        What is the perfect number?
        A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
        Proper positive divisors are positive integers that fully divide the perfect number without leaving
        a remainder and exclude the perfect number itself.

        For example, take the number 6:
        Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded),
        and the sum of its proper divisors is 1 + 2 + 3 = 6.

        Therefore, 6 is a perfect number (as well as the first perfect number).



        Write a method named isPerfectNumber with one parameter of type int named number.

        If number is < 1, the method should return false.

        The method must calculate if the number is perfect. If the number is perfect, the method should return true;
        otherwise, it should return false.



        EXAMPLE INPUT/OUTPUT:

        isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6

        isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28

        isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5

        isPerfectNumber(-1); should return false since the number is < 1



        HINT: Use a while or for loop.

        HINT: Use the remainder operator.

        NOTE: The method isPerfectNumber should be defined as public static like we have been doing so far in the course.

        NOTE: Do not add a main method to the solution code.*/

public class PerfectNumber {
    /*Algorithm
    *
    * Take an input value and check if it is <1, if yes return false
    * If not, start a loop from 1 to given input value - 1 (Should not count given input value) at increments of 1.
    * Check every loop if given input can divided by that iterable value and return no remainder (num % i == 0)
    * Any iterable value that leaves no remainder is added to new variable called sum, repeat till loop ends.
    * Check if sum equals given input value, if yes return true else false
    *  */

    public static boolean isPerfectNumber(int num){
        if (num < 1 ){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++){
            if( num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }
}
