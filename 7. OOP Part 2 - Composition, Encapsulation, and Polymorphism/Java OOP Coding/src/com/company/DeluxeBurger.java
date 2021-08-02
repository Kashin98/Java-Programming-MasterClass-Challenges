package com.company;

public class DeluxeBurger extends Hamburger{
    private String chips;
    private double chipsPrice;
    private String drink;
    private double drinkPrice;
    private double deluxeBurgerPrice;

    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat, false, false, false, false);
        this.chips = "Chips";
        this.chipsPrice = 3.49;
        this.drink = "Drink";
        this.drinkPrice = 1.99;
        this.deluxeBurgerPrice = chipsPrice + drinkPrice;
    }

    @Override
    public void getFinalPrice() {
        System.out.println("Addition is " + chips + ", Price: " + chipsPrice);
        System.out.println("Addition is " + drink + ", Price: " + drinkPrice);
        super.setBasePrice(3.00);
        super.setFinalPrice(deluxeBurgerPrice);
        super.getFinalPrice();
    }

}
