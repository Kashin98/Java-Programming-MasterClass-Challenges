package com.company;

/*Largest Prime
        Write a method named getLargestPrime with one parameter of type int named number.

        If the number is negative or does not have any prime numbers,
        the method should return -1 to indicate an invalid value.

        The method should calculate the largest prime factor of a given number and return it.

        EXAMPLE INPUT/OUTPUT:
        getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
        getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
        getLargestPrime (0); should return -1 since 0 does not have any prime numbers
        getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        getLargestPrime (-1); should return -1 since the parameter is negative

        HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

        NOTE: The method getLargestPrime should be defined as public static like we have been doing so far.

        NOTE: Do not add a main method to the solution code.*/

public class LargestPrime {
    /*Algorithm
    *
    * Check if given input is less than or equal to 1, since we want to eliminate all numbers that are not prime.
    * Now start a loop which increase by one until it is equal to given input number - 1 (we can't count input number
      as a factor)
    * Inside loop find factors of number by checking if the iterable value leaves a remainder of 0 when input number is
      divided by it (n % i == 0)
    * Again inside the loop check if the factor that you just found is a prime number.
    * If both conditions are met above then assign value to new var largestPrime and continue loop until the next
      larger iterable value is found which meets both conditions again and assign that value to largestPrime
    * Once loop ends you have the largestPrime, you just have to return it.
    */

    public static int getLargestPrime(int n){
        if(n <= 1){
            return -1;
        }
        int largestPrime = 0;
        for (int i= 2; i < n; i++){
            if(n % i == 0 && isPrime(i)){
                largestPrime = i;
            }
        }
        return largestPrime;
    }
    public static boolean isPrime(int n){
        for (int j = 2; j <= n/2; j++){
            if(n % j == 0){
                return false;
            }
        }
        return true;
    }

}
