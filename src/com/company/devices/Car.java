package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {

    private Double milage;
    public final Double value;
    public double fuel = 10.1;


    public List<Human> carOwner = new ArrayList<>();

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


    public void sell(Human seller, Human buyer, Double price, int parkingSpace) throws Exception {

        if (seller.getCarv2(parkingSpace) == this || carOwner.get(carOwner.size() - 1) == seller) {
            if (seller.cash >= price) {
                buyer.cash -= price;
                buyer.setCar(this, parkingSpace);
                seller.setCarWOLIST(null, parkingSpace);
                seller.cash += price;
                System.out.println("Gratulacje transakcji.");
            } else {
                System.out.println("Brak kasy.");
            }
        } else {
            System.out.println("Sprzedawca nie ma auta ");
        }
    }

    //abstract
    public abstract void refuel();


    public void lastOwner() {
        Human last = carOwner.get(carOwner.size() - 1);
        System.out.println(last);

    }

    public void anyOwner() {

        if (carOwner != null && carOwner.size() >= 2) {
            System.out.print("This car is used by: ");
            lastOwner();
        } else {
            System.out.println("This car is new.");
        }
    }

    public void howManyTrans() {
        int tempnumber = carOwner.size() - 1;


        if (tempnumber == -1) {
            System.out.println("This car has not got any transaction history");
        } else {
            System.out.println("This car was sold about: " + tempnumber);
        }
    }

}
