package com.company.devices;

public abstract class Car extends Device {

    private Double milage;
    public final Double value;
    public double fuel = 10.1;



    public Double getfuel() {
        return fuel;
    }

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


//    @Override
//    public void sell(Human seller, Human buyer, Double price) throws Exception {
//
//
//
//        if (seller.getCar() == this) {
//            if (seller.cash >= price) {
//                buyer.cash -= price;
//                buyer.setCar(this);
//                seller.setCar(null);
//                seller.cash += price;
//                System.out.println("Gratulacje transakcji.");
//            } else {
//                System.out.println("Brak kasy.");
//            }
//        } else {
//            System.out.println("Sprzedawca nie ma auta ");
//        }
//    }

    //abstract
    public abstract void refuel();


}
