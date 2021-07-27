package com.company;

public class Main {

    public static void main(String[] args) {
        first3Primes();
    }

//    3 primes from any range of numbers
    public static void first3Primes(){
        int limit = 0;
        for (int i = 15; i<=100; i++){
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                limit++;
            }
            else if( limit==3 ){
                break;
            }
        }
    }


//    My prime num checker
    public static boolean isPrime(int num){
//        Checks if num is 1 or lesser since primes cannot be 1 or less
        if(num <= 1){
            return false;
        }
        for(int i=2; i <= num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}

