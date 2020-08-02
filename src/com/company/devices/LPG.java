package com.company.devices;

public class LPG extends Car {
    public LPG(String producent, String model, int yearOfProduction, double value) {
        super(producent, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        double tankowanie = 100 - fuel;
        fuel = fuel + tankowanie;

        System.out.println("LPG z kuchenki zatankowane");

    }

    public void getFuel() {
        System.out.println(fuel);
    }


}
