package com.company.devices;

public class Phone extends Device {
    private Double screenSize;


    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone clone() {
        Phone phone = new Phone();
        phone.producent = this.producent;
        phone.model = this.model;
        phone.screenSize = this.screenSize;
        return phone;

    }

}
