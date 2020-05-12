package com.company.devices;

public abstract class Device {
    public String producent;
    public String model;
    public int yearOfProduction;

    public Device(String producent, String model, int yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    public String toString() {
        return producent + " " + model + " " + yearOfProduction;
    }

    abstract public void turnOn();


}
