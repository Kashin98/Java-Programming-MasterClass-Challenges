package com.company;

public class Bed {
    private String size;
    private int personAccommodation;

    public Bed(String size, int personAccommodation) {
        this.size = size;
        this.personAccommodation = personAccommodation;
    }

    public String getSize() {
        return size;
    }

    public int getPersonAccommodation() {
        return personAccommodation;
    }
}
