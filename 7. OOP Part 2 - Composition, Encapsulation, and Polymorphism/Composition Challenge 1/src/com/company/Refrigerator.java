package com.company;

public class Refrigerator extends KitchenEquipment {
    private int sections;
    private int freezerTemp;
    private int idealTemp;

    public Refrigerator(String model, String manufacturer, int warrantyTime, int sections, int freezerTemp,
                        int idealTemp) {
        super(model, manufacturer, warrantyTime);
        this.sections = sections;
        this.freezerTemp = freezerTemp;
        this.idealTemp = idealTemp;
    }

    public int getSections() {
        return sections;
    }

    public int getFreezerTemp() {
        return freezerTemp;
    }

    public int getIdealTemp() {
        return idealTemp;
    }


}
