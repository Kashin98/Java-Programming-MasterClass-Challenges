package com.company;

public class Kitchen {
    private Refrigerator refrigerator;
    private Stove stove;

    public Kitchen( Refrigerator refrigerator, Stove stove) {
        this.refrigerator = refrigerator;
        this.stove = stove;
    }


    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public Stove getStove() {
        return stove;
    }


}
