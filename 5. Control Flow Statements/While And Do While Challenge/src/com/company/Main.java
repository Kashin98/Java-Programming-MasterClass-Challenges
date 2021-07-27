package com.company;

// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found



public class Main {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int sum = 0;
        int limit = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                limit++;
            }
            if (limit <= 5){
                System.out.println("Even number " + number);
                sum += number;
                number++;
                continue;
            }
            break;
        }
        System.out.println(sum + " is sum of the 5 numbers");
    }


//    Check Even Number
    public static boolean isEvenNumber(int n){
        /*Simplified version for returning boolean values is just return only the condition and if it's true it returns
        true else false*/
        return n % 2 == 0;
    }
}
