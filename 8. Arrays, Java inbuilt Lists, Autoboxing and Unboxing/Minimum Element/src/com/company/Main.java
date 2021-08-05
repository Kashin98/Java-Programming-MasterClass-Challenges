package com.company;

/*
Write a method called readInteger() that has no parameters and returns an int.

        It needs to read in an integer from the user - this represents how many elements the user needs to enter.
        Write another method called readElements() that has one parameter of type int
        The method needs to read from the console until all the elements are entered, and then return an array containing
        the elements entered.
        And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the
        minimum value in the array.

        The scenario is:

        1. readInteger() is called.
        2. The number returned by readInteger() is then used to call readElements().
        3. The array returned from readElements() is used to call findMin().
        4. findMin() returns the minimum number.

        [Do not try and implement this. It is to give you an idea of how the methods will be used]

        TIP: Assume that the user will only enter numbers, never letters.
        TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of
        the two methods that are reading in input from the user.
        TIP: Be extremely careful about spaces in the printed message.

        NOTE: All methods should be defined as private static.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the amount values you want in an Array");
        int count = scanner.nextInt(); // readInteger() method simplified

        System.out.println("Enter the " + count + " Integers");
        int[] array = readElements(count);
        System.out.println(Arrays.toString(array));

        System.out.println("The minimum element in the array is: " + minimumElement(array));

    }

    public static int[] readElements(int count){
        int[] array = new int[count];

        for (int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }


//      Function to find minimum value in array
    public static int minimumElement(int[] array){
//        We create a var minvalue and assign the first value of the array to it;
        int minValue = array[0];
       /* Then we create a for loop which iterates through each array value starting from index value 1 since value
        0 is assigned to minvalue var. We check if the min value is great than any of the other values in the index, if
        it is we assign that value to min value var and continue the loop till we find another value which is lesser
        than min value, we continue till loop finishes */
        for(int i = 1; i < array.length; i++){
            if(minValue > array[i]){
                minValue = array[i];
            }
        }
        return minValue;
    }

}
