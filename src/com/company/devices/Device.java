package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public String producent;
    public String model;
    public int yearOfProduction;
    double Value;

    public Device(String producent, String model, int yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    public String toString() {
        return producent + " " + model + " " + yearOfProduction;
    }

    abstract public void turnOn();

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }
}
