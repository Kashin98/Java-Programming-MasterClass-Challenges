package com.company;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private String cheese;
    private double cheesePrice;
    private String tomatoes;
    private double tomatoesPrice;
    private String pickles;
    private double picklesPrice;
    private String mustard;
    private double mustardPrice;
    private boolean cheeseAdd;
    private boolean tomatoesAdd;
    private boolean picklesAdd;
    private boolean mustardAdd;
    private double finalPrice;
    private double basePrice;

    public Hamburger(String breadRoll, String meat, boolean cheeseAdd, boolean tomatoesAdd, boolean picklesAdd,
                     boolean mustardAdd) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.cheese = "Cheese";
        this.cheesePrice = 0.99;
        this.tomatoes = "Tomatoes";
        this.tomatoesPrice = 0.79;
        this.pickles = "Pickles";
        this.picklesPrice = 0.59;
        this.mustard = "Mustard";
        this.mustardPrice = 1.29;
        this.cheeseAdd = cheeseAdd;
        this.tomatoesAdd = tomatoesAdd;
        this.picklesAdd = picklesAdd;
        this.mustardAdd = mustardAdd;
        this.basePrice = 2.98;
        this.finalPrice = 0;
    }

    public void getFinalPrice() {
        finalPrice += basePrice;
        if(cheeseAdd){
            System.out.println("Addition is " + cheese + ", Price: " + cheesePrice);
            finalPrice += cheesePrice;
        }
        if(picklesAdd){
            System.out.println("Addition is " + pickles + ", Price: " + picklesPrice);
            finalPrice += picklesPrice;
        }
        if(mustardAdd){
            System.out.println("Addition is " + mustard + ", Price: " + mustardPrice);
            finalPrice += mustardPrice;
        }
        if(tomatoesAdd){
            System.out.println("Addition is " + tomatoes + ", Price: " + tomatoesPrice);
            finalPrice += tomatoesPrice;
        }
        getBaseBurger();
        System.out.println("The final price of the burger: $" + finalPrice);
    }

    public void getBaseBurger(){
        System.out.println("Base burger price containing " + getBreadRoll() +" roll with " + getMeat() + " Meat: $" + basePrice);
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}


