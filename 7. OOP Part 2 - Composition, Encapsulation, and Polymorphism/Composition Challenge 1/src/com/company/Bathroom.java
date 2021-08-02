package com.company;

public class Bathroom {
    private String toilet;
    private String bathtub;
    private String sink;
    private boolean bathroomLightsOn;

    public Bathroom(String toilet, String bathtub, String sink, boolean bathroomLightsOn) {
        this.toilet = toilet;
        this.bathtub = bathtub;
        this.sink = sink;
        this.bathroomLightsOn = bathroomLightsOn;
    }

    public String getToilet() {
        return toilet;
    }

    public String getBathtub() {
        return bathtub;
    }

    public String getSink() {
        return sink;
    }

    public boolean isBathroomLightsOn() {
        return bathroomLightsOn;
    }
}
