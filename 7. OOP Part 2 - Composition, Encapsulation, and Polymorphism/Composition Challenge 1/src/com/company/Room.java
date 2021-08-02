package com.company;

public class Room {
    private Bed bed;
    private Bathroom bathroom;
    private Kitchen Kitchen;

    public Room(Bed bed,  Bathroom bathroom, com.company.Kitchen kitchen) {
        this.bed = bed;
        this.bathroom = bathroom;
        this.Kitchen = kitchen;
    }

    public void bedSpecifications(){
        System.out.println("The size is "+ bed.getSize());
        System.out.println("It can accommodate "+ bed.getPersonAccommodation() + " persons");
    }

    public void getBathroomDetails() {
        System.out.println(bathroom.getSink() + ", " + bathroom.getToilet() + ", " + bathroom.getBathtub());        ;

    }

    public Kitchen getKitchen(){
        return Kitchen;
    }
}
