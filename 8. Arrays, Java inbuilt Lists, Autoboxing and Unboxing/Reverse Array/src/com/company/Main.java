package com.company;
/*
-Write a method called reverse() with an int array as a parameter.

    -The method should not return any value. In other words, the method is allowed to modify the array parameter.
    -In main() test the reverse() method and print the array both reversed and non-reversed.
    -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element.
    -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

    Tip:
    -Create a new console project with the name ReverseArrayChallenge*/

import java.util.Arrays;

public class Main {
    /* Algorithm - Reverse any array.
    *
    * Create a new array called reverseArray and make it's length same as the passed in array.
    * Start a for loop from int index value 0 up to array.length value (i < array.length) and increment value by 1.
    * Inside the loop we assign the values of the passed in array to the values of a reverseArray.
    * We assign the first index value of the passed in array to the last index value of the reverseArray by using simple
      trick of subtracting i value from the reverseArray.length - 1 and assigning it the i value of passed in array.
    * (so if reverseArray.length-1 is 9-1 = 8 - i (i reduces by 1 each time) = 7,6,5,4..) and assigning it the i value
      of passed array (array[i] (0 + i = 1,2,3,4...)).
    * */

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] reversedArray = reverseArray(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverseArray[(reverseArray.length - 1) - i] = array[i];
        }
        return reverseArray;
    }
}
