package com.company;

public class Stove extends KitchenEquipment{
    private boolean electricStove;
    private int numberOfBurners;

    public Stove(String model, String manufacturer, int warrantyTime, boolean electricStove, int numberOfBurners) {
        super(model, manufacturer, warrantyTime);
        this.electricStove = electricStove;
        this.numberOfBurners = numberOfBurners;
    }

    public boolean isElectricStove() {
        return electricStove;
    }

    public int getNumberOfBurners() {
        return numberOfBurners;
    }
}

