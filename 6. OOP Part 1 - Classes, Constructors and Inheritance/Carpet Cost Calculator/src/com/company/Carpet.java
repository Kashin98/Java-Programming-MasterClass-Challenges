package com.company;

public class Carpet {
    private double cost;

//    Constructor
//    The cost parameter is taking in cost per square meter.
    public Carpet(double cost) {
        if(cost < 0){
            this.cost = 0;
        }
        else {
            this.cost = cost;
        }
    }

//    Getter only for cost
    public double getCost() {
        return cost;
    }
}
