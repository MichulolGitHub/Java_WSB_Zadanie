package com.company.devices;

public abstract class Device {
    public String producent;
    public String model;


    public String toString() {//overriding the toString() method
        return producent + " " + model;
    }
}
