package com.company;
/*
Input Calculator
        Write a method called inputThenPrintSumAndAverage that does not have any parameters.

        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

        When the user enters something that is not an int then it needs to print a message in the format
        "SUM = XX AVG = YY".

        XX represents the sum of all entered numbers of type int.
        YY represents the calculated average of all numbers of type long.

        EXAMPLES OF INPUT/OUTPUT:
        EXAMPLE 1:
        INPUT:
        1
        2
        3
        4
        5
        a

        OUTPUT
        SUM = 15 AVG = 3


        EXAMPLE 2:
        INPUT:
        hello

        OUTPUT:
        SUM = 0 AVG = 0

      */
/* TIP: Use Scanner to read an input from the user.
         TIP: Use casting when calling the round method since it needs double as a parameter.
         NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.
         NOTE: Be mindful of spaces in the printed message.
         NOTE: Be mindful of users who may type an invalid input right away (see example above).
         NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far.
        NOTE: Do not add the main method to the solution code*/

import java.util.Scanner;

public class InputCalculator {
    /* Algorithm
    *
    * Create an endless loop and 2 new variables count and sum.
    * Take user input and check that is of type int.
    * if yes, add user input to sum and increase value of count by 1.
    * Repeat step 2 - 3 until user enters an invalid type.
    * Once user enters an invalid type break loop.
    * Calculate average by dividing sum with count.
    * Print Sum and average */

    public static void inputThenPrintSumAndAverage(){
        int count= 0;
        int sum = 0;
        long average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Numbers");
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum += scanner.nextInt();
                count++;
                average = (sum / count );
            }else {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + average );
    }

}
