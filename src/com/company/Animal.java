package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog") {
            weight = 10.0;
        } else if (species == "Lion") {
            weight = 180.0;
        } else {
            weight = 1.0;
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

}
