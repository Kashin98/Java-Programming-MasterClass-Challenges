package com.company;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Main {

    public static void main(String[] args) {
//        This java program consists of both inheritance and composition to understand the Is-a and Has-a relationship

//        Bathroom
        Bathroom bathroom = new Bathroom("1 Jaquar Toilet", "1 Kohler Bathtub", "1 TOTO sink", false);

//        Kitchen (Uses Inheritance is-a relationship with KitchenEquipment class)
        Refrigerator refrigerator = new Refrigerator("300-Series", "LG", 5,2,-18,4);
        Stove stove =  new Stove("205-A", "Englander", 4, true, 2);
        Kitchen kitchen = new Kitchen(refrigerator, stove);

//        Room
        Room room = new Room(new Bed("King-Size", 2), bathroom, kitchen );

//        Using methods
//        not using multiple object getters and creating the methods for it in Room class (composition part 2)
        room.bedSpecifications();
        room.getBathroomDetails();

//        Using getters through multiple objects to provide details (composition part 1)
        System.out.println(room.getKitchen().getRefrigerator().getSections());
        System.out.println(room.getKitchen().getStove().isElectricStove());
        room.getKitchen().getRefrigerator().getModelManufacturerAndWarranty();
        room.getKitchen().getStove().getModelManufacturerAndWarranty();
    }
}
