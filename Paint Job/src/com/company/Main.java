package com.company;

public class Main {

    public static void main(String[] args) {
//        First Method
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
//        OverLoaded method without extraBuckets parameter
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
//        Last Overloaded Method that takes areaOfWall and areaOfBucket
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
    }
}
