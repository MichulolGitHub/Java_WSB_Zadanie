package com.company;

import java.io.File;

public class Animal {
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

    void feed() {
        if (weight <= 0.0) {

            System.out.println("Za późno na karmienie...");
        } else {
            weight += 0.1;
            System.out.println("Dzięki za karme, moja aktualna waga to: " + weight);
        }


    }

    void takeForAWalk() {
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

}
