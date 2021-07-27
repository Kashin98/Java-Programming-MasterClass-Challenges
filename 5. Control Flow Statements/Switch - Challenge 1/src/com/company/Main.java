package com.company;

// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

public class Main {

    public static void main(String[] args) {
	        char switchChar = 'E';
	        switch (switchChar){
                case 'A': case 'B': case 'C': case 'D': case 'E':
                    System.out.println("The char you typed in was " + switchChar);
                    break;
                default:
                    System.out.println("Char 'A','B','C', 'D' or 'E' was not found ");
                    break;
            }
    }
}
