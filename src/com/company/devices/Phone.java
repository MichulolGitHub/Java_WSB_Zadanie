package com.company.devices;

public class Phone extends Device {
    public Double screenSize;


    public Phone(String model, String producer, double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;

    }

    @Override
    public void turnOn() {
        System.out.println("Phone is working");
    }
}
