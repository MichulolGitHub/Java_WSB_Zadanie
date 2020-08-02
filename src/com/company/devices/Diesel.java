package com.company.devices;

public class Diesel extends Car {


    public Diesel(String producent, String model, int yearOfProduction, double value) {
        super(producent, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        double tankowanie = 100 - fuel;
        fuel = fuel + tankowanie;

        System.out.println("Zatankowales Diesla");

    }

    public void getFuel() {
        System.out.println(fuel);
    }


}
