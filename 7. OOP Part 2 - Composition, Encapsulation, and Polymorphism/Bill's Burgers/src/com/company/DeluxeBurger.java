package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Deluxe", "Deluxe", 19.10);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No Additions can be done");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No Additions can be done");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No Additions can be done");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No Additions can be done");
    }
}
