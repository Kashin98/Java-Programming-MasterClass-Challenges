package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamburger(){
        System.out.println(name + " burger with " + breadRollType + " roll and" + meat + " meat: " + price);

        if(addition1Name != null){
            System.out.println("The Addition is " + addition1Name + ", Price: " + addition1Price);
            price += addition1Price;
        }
        if(addition2Name != null){
            System.out.println("The Addition is " + addition2Name + ", Price: " + addition2Price);
            price += addition2Price;
        }
        if(addition3Name != null){
            System.out.println("The Addition is " + addition3Name + ", Price: " + addition3Price);
            price += addition3Price;
        }
        if(addition4Name != null){
            System.out.println("The Addition is " + addition4Name + ", Price: " + addition4Price);
            price += addition4Price;
        }
        return this.price;
    }
}

