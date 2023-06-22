package org.example;

public class Lemonade {

    private String flavor;
    private String name;
    private double volume;


    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void openBottle() {
        System.out.println("Open bottle");
    }
    public Lemonade (String flavor, String name, double volume) {
        this.flavor = flavor;
        this.name = name;
        this.volume = volume;


    }
}
