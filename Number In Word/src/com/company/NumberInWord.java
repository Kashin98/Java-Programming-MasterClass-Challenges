package com.company;

/*Number In Word

        Write a method called printNumberInWord. 
        The method has one parameter number which is the whole number. 
        The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" 
        if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. 
        You can use if-else statement or switch statement whatever is easier for you.

        NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
        NOTE: Do not add main method to solution code.*/

public class NumberInWord {
    
    public static void printNumberInWord(int switchValue){

        switch (switchValue){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");

//        Shorter Method but can't print values in string form "Zero", instead will print 0

//        switch (switchValue){
//            case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
//                System.out.println("Number is " + switchValue);
//                break;
//            default:
//                System.out.println("Other");
//        }

        }
    }
}
