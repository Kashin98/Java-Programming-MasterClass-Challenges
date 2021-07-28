package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

//    Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

//    Calculate
    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
