package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(FlourPack.canPack (1, 0, 4));
        System.out.println(FlourPack.canPack (1, 0, 5));
        System.out.println(FlourPack.canPack (0, 5, 4));
        System.out.println(FlourPack.canPack (2, 2, 11));
        System.out.println(FlourPack.canPack (-3, 2, 12));
    }
}
