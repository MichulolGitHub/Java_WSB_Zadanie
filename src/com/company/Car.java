package com.company;

public class Car {
    final String model;
    final String producent;
    private Double milage;


    public Car(String producent, String model) {

        this.model = model;
        this.producent = producent;

    }

    public Double getMilage() {
        return milage;
    }

    public void setMilage(Double milage) {
        this.milage = milage;
    }
}
