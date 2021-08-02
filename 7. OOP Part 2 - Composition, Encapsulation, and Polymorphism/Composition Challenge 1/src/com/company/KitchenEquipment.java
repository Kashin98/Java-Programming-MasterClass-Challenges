package com.company;

public class KitchenEquipment {
    private String model;
    private String manufacturer;
    private int warrantyTime;

    public KitchenEquipment(String model, String manufacturer, int warrantyTime) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.warrantyTime = warrantyTime;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void getModelManufacturerAndWarranty(){
        System.out.println("The model is " + this.model + ", the manufacturer is " + this.manufacturer + " and the " +
                "warranty is " + this.warrantyTime + " years");
    }
}
