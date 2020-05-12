package com.company.devices;

public class Car extends Device {

    private Double milage;
    public final Double value;


    public Double getMilage() {
        return milage;
    }

    public void setMilage(Double milage) {
        this.milage = milage;
    }


    public Car(String producent, String model, int yearOfProduction, double value) {
        super(producent, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is working");
    }
}
