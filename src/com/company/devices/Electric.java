package com.company.devices;

public class Electric extends Car {
    public Electric(String producent, String model, int yearOfProduction, double value) {
        super(producent, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        double tankowanie = 100 - fuel;
        fuel = fuel + tankowanie;
        System.out.println("Naładowano Baterie");

    }

    public void getFuel() {
        System.out.println(fuel);
    }


}
