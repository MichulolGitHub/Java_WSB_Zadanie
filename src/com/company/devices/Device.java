package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public String producent;
    public String model;

    public Device(String producent, String model) {
        this.producent = producent;
        this.model = model;
    }


    public String toString() {
        return producent + " " + model;
    }

    abstract public void turnOn();

    public void sell() {
        System.out.println("You sold " + this.toString());
    }

}
