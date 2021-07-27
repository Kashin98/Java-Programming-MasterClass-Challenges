package com.company;

/*Even Digit Sum
        Write a method named getEvenDigitSum with one parameter of type int called number.

        The method should return the sum of the even digits within the number.

        If the number is negative, the method should return -1 to indicate an invalid value.



        EXAMPLE INPUT/OUTPUT:

        getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        getEvenDigitSum(-22); → should return -1 since the number is negative



        NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.

        NOTE: Do not add a main method to the solution code.*/

public class EvenDigitSum {

    public static int getEvenDigitSum(int n){
        if(n < 0){
            return -1;
        }
        int evenSum = 0;
//        Run loop till n < 0 from n/10
        while (n > 0){
//            inside loop we take lastDigit and we which is digit in 10s place of the whole number. We check if digit
//            is even and add it if it is. We then divide big number by 10 to make next number in value come to 10s
//            place, repeat process.
            int lastDigit = n % 10;
            if(lastDigit % 2 == 0){
                evenSum += lastDigit;
            }
            n /= 10;
        }
        return evenSum;
    }
}
