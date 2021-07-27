package com.company;

import java.util.Scanner;

/*-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

        Hint:
        -Use an endless while loop.

*/

public class Main {

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
//                First we take the user input and save it into a var
                int number = scanner.nextInt();
                if( number > max){
                    max = number;
                }
                if( number < min){
                    min = number;
                }
            }else{
                break;
            }
        }
        System.out.println("The min value is: " + min + " and max is " + max);
    }
}
