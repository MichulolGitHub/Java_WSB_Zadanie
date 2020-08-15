package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;


public class Phone extends Device {
    public Double screenSize;
    static final String SERVERADDRESS = "xyz.local";
    static final int SERVERPORT = 4345;
    static final double VERSIONAPP = 1.1;
    String nameOfApliaction = "XYZ";

    private Human ownerOfPhone;

    private List<Application> applicationsDevice = new ArrayList<>();

    public Phone(String model, String producer, double screenSize, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;

    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turning on.");
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

//    public void installAnApp(String nameOfApliaction) {
//
//        System.out.println("Only name of Aplication");
//    }
//
//    public void installAnAPP(String nameOfApliaction, double versionApp) {
//
//        System.out.println("Name of Aplication + Version App");
//    }
//
//    public void installAnAPP(String nameOfApliaction, double versionApp, String serverAddress) {
//
//        System.out.println("Name of Aplication + Version App + server address");
//    }
//
//    public void installAnAPP(String nameOfApliaction, double versionApp, String serverAddress, int serverPort) {
//
//        System.out.println("Name of Aplication + Version App + server address + server port");
//    }
//
//    public void installAnAPP(String nameOfApliaction, double versionApp, String serverAddress, int serverPort, URL url) {
//
//        System.out.println("Name of Aplication + Version App + server address + server port + url");
//    }
//
//    class URL {
//
//    }


    public Human getOwnerOfPhone() {
        return ownerOfPhone;
    }

    public void setOwnerOfPhone(Human owner) {
        this.ownerOfPhone = owner;

    }


    public void installAnApp(Application application) {
        if (this.getOwnerOfPhone() == null) {
            System.out.println("You dont have phone.");

        } else if (this.getOwnerOfPhone().cash < application.priceOfApplication) {
            System.out.println("Not money for this app.");

        } else {
            getOwnerOfPhone().cash -= application.priceOfApplication;
            System.out.println("Application bought.");

            this.applicationsDevice.add(application);
        }
    }

    public boolean alreadyInstalled(Application application) {
        return this.applicationsDevice.contains(application);

    }

    public boolean alreadyInstalled(String TEMPnameofapplication) {

        for (Application application : this.applicationsDevice) {
            if (application.nameOfApplication.equals(TEMPnameofapplication))

                return true;
        }

        return false;

    }

    public void ALLfreeApps() {
        for (Application application : this.applicationsDevice) {

            if (application.priceOfApplication == 0.0) {
                System.out.println("Free installed app: " + application.nameOfApplication);

            }
        }
    }

    public void totalValueOfApps() {
        Double valueTEMP = 0.0;
        for (Application application : this.applicationsDevice) {

            valueTEMP += application.priceOfApplication;

        }
        System.out.println("Total value of your applications: " + valueTEMP);


    }

}


