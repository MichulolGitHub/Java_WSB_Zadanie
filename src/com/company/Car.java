package com.company;

public class Car {
    final String model;
    final String producent;
    private Double milage;
    final Double value;


    public Double getMilage() {
        return milage;
    }

    public void setMilage(Double milage) {
        this.milage = milage;
    }


    public Car(String producent, String model, double value) {
        this.model = model;
        this.producent = producent;
        this.value = value;
    }
}
