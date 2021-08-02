package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;


    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, "Brown Rye", price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyPrice = super.itemizeHamburger();

        if(healthyAddition1Name != null){
            System.out.println("The Addition is " + healthyAddition1Name + ", Price: " + healthyAddition1Price);
            healthyPrice += healthyAddition1Price;
        }
        if(healthyAddition2Name != null){
            System.out.println("The Addition is " + healthyAddition2Name + ", Price: " + healthyAddition2Price);
            healthyPrice += healthyAddition2Price;
        }
        return healthyPrice;
    }
}
