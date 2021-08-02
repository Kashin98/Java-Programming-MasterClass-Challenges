package com.company;

public class HealthyBurger extends Hamburger{
    private String  mushrooms;
    private double  mushroomsPrice;
    private String lettuce;
    private double lettucePrice;
    private boolean mushroomsAdd;
    private boolean lettuceAdd;
    private double healthyBurgerPrice;


    public HealthyBurger(String meat, boolean cheeseAdd, boolean tomatoesAdd, boolean picklesAdd,
                         boolean mustardAdd, boolean mushroomsAdd, boolean lettuceAdd) {
        super("Brown Rye", meat, cheeseAdd, tomatoesAdd, picklesAdd, mustardAdd);
        this.mushrooms = "Mushrooms";
        this.mushroomsPrice = 1.49;
        this.lettuce =  "Lettuce";
        this.lettucePrice = 0.49;
        this.mushroomsAdd = mushroomsAdd;
        this.lettuceAdd = lettuceAdd;
        this.healthyBurgerPrice = 0;
    }

    @Override
    public void getFinalPrice() {
        if(mushroomsAdd){
            System.out.println("Addition is " + mushrooms + ", Price: " + mushroomsPrice);
            healthyBurgerPrice += mushroomsPrice;
        }
        if(lettuceAdd){
            System.out.println("Addition is " + lettuce+ ", Price: " + lettucePrice);
            healthyBurgerPrice += lettucePrice;
        }
        super.setBasePrice(3.98);
        super.setFinalPrice(healthyBurgerPrice);
        super.getFinalPrice();
    }
    
}

