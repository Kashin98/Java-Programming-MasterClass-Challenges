package com.company;

public class Car {
    private boolean engine;
    private int wheels;
    private String name;
    private int cylinders;

    public Car( int cylinders,String name) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        return "The engine is starting";
    }
    public String accelerate(){
        return "The car is accelerate";
    }
    public String brake(){
        return "The car is braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

