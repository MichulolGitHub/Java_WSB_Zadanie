package com.company.creatures;

import com.company.Human;
import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Edbile, Feedable {
    final String species;
    String name;
    File pic;
    protected Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 11.0;
    static final Double DEFAULT_LION_WEIGHT = 11.0;
    static final Double DEFAULT_OTHER_WEIGHT = 11.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }

    }

    public void feed() {
        if (weight <= 0.0) {

            System.out.println("Za późno na karmienie...");
        } else {
            weight += 0.1;
            System.out.println("Dzięki za karme, moja aktualna waga to: " + weight);
        }


    }

    public void takeForAWalk() {
        if (weight <= 0.0) {
            System.out.println("Zwierze nie zyje... Nie mozna wyjsc z nim na spacer. ");
        } else if (weight <= 1.0) {
            weight -= 0.1;
            System.out.println("Po wyjsciu jestem glodny. Moja aktualna waga to: " + weight);
        } else {
            weight -= 0.1;
            System.out.println("Dzieki za wyjscie. Moja aktualna waga to: " + weight);
        }
    }


    public Double getWeight() {

        return weight;
    }


    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Nie sprzedajemy ludzi!!");
        } else {
            if (buyer.cash < price) {
                throw new Exception("Kupujacego nie stac.");
            }
            if (seller.pet != this) {
                throw new Exception("Sprzedawca nie posiada zwierzaka na sprzedaz.");
            }
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println(buyer.firstName + " zakupil od " + seller.firstName + " " + buyer.pet);
        }


    }


    @Override
    public void beEaten() {

    }

}



