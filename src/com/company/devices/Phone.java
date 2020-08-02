package com.company.devices;

public class Phone extends Device {
    public Double screenSize;
    static final String SERVERADDRESS = "xyz.local";
    static final int SERVERPORT = 4345;
    static final double VERSIONAPP = 1.1;
    String nameOfApliaction = "XYZ";


    public Phone(String model, String producer, double screenSize, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;

    }

    @Override
    public void turnOn() {

    }

//    @Override
//    public void sell(Human buyer, Human seller, Double price) throws Exception {
//        if (seller.phone == this) {
//            if (seller.cash >= price) {
//                buyer.cash -= price;
//                buyer.phone = seller.phone;
//                seller.phone = null;
//                seller.cash += price;
//                System.out.println("Gratulacje transakcji.");
//            }
//            if (buyer.cash < price) {
//                throw new Exception("Kupujacego nie stac.");
//            }
//        } else {
//            throw new Exception("Sprzedawca nie ma telefonu.");
//        }
//    }

    public void installAnApp(String nameOfApliaction) {

        System.out.println("Only name of Aplication");
    }

    public void installAnAPP(String nameOfApliaction, double versionApp) {

        System.out.println("Name of Aplication + Version App");
    }

    public void installAnAPP(String nameOfApliaction, double versionApp, String serverAddress) {

        System.out.println("Name of Aplication + Version App + server address");
    }

    public void installAnAPP(String nameOfApliaction, double versionApp, String serverAddress, int serverPort) {

        System.out.println("Name of Aplication + Version App + server address + server port");
    }

    public void installAnAPP(String nameOfApliaction, double versionApp, String serverAddress, int serverPort, URL url) {

        System.out.println("Name of Aplication + Version App + server address + server port + url");
    }

    class URL {

    }

}


