package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    public Double screenSize;


    public Phone(String model, String producer, double screenSize, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (seller.phone == this) {
            if (seller.cash >= price) {
                buyer.cash -= price;
                buyer.phone = seller.phone;
                seller.phone = null;
                seller.cash += price;
                System.out.println("Gratulacje transakcji.");
            }
            if (buyer.cash < price) {
                throw new Exception("Kupujacego nie stac.");
            }
        } else {
            throw new Exception("Sprzedawca nie ma telefonu.");
        }
    }


}
