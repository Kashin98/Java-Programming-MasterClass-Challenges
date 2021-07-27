package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(SumOdd.sumOddRange(1,1000));
        System.out.println(SumOdd.sumOddRange(-1,1000));
        System.out.println(SumOdd.sumOddRange(100,100));
        System.out.println(SumOdd.sumOddRange(13,13));

//        This is why we return in long
        System.out.println(SumOdd.sumOddRange(10,100000));
    }
}
