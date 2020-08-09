package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {

    public static void main(String[] args) throws Exception {

//        Human me = new Human();
//        me.firstName = "Marek";
//        me.lastName = "Kowalski";
//        me.pet = new Animal("cat") {
//            @Override
//            public void feed(Double foodWeight) {
//
//            }
//        };
//
//
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//
//        System.out.println(me.pet.getWeight());
//
//
//        System.out.println("---------------ZADANIE 3 i 4---------------");
//        me.setSalary(10321); // Ustawianie nowej pensji
//        me.getSalary();  // Wypisywanie aktualnej pensji
//
//        System.out.println("---------------ZADANIE 5---------------");
//        me.setCar(new Car("Audi", "A7", 2010, 300) {
//            @Override
//            public void refuel() {
//
//
//            }
//        });
//        System.out.println(me.getCar().model + " " + me.getCar().producent);

//        System.out.println("---------------ZADANIE 6/do poprawy--------------");
//        Human myWife = new Human();
//        myWife.firstName = "Karolina";
//        myWife.lastName = "Kowalski";
//        myWife.setCar(new Car("Audi","A7",100000));

        System.out.println("---------------ZADANIE NA LECKJI---------------");
//        System.out.println(me.species);
//        me.feed();
//        me.takeForAWalk();
//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Animal);
//        System.out.println(me instanceof Object);

//        System.out.println("---------------ZADANIE 7-------------------");
//        Phone nokia = new Phone("3310", "Nokia", 5.5, 2010);
//        Car audi = new Car("Audi", "A7", 2010, 25) {
//            @Override
//            public void refuel() {
//
//
//            }
//        };
//
//        System.out.println(nokia);
//        System.out.println(audi);


//        System.out.println("---------------ZADANIE 8-------------------");
//
//        Human kupujacy = new Human();
//        kupujacy.firstName = "Rychu";
//        kupujacy.lastName = "Kowalski";
//        kupujacy.cash = 2500.0;
//        Phone telefonkkupujacy = new Phone("X", "Iphone", 5.1, 2018);
//        kupujacy.phone = telefonkkupujacy;
//
////        Human sprzedajacy = new Human();
//        sprzedajacy.firstName = "Andrzej";
//        sprzedajacy.lastName = "Duda";
//        sprzedajacy.pet = new Animal("gąsienica") {
//            @Override
//            public void feed(Double foodWeight) {
//
//            }
//        };
//        sprzedajacy.cash = 25.0;
//        Animal petsprzedawcy = new Animal("gąsienica") {
//            @Override
//            public void feed(Double foodWeight) {
//
//            }
//        };
//        sprzedajacy.pet = petsprzedawcy;
//
//
//        System.out.println("PRZED SPRZEDAZA (SPRAWDZENIE):");
//        System.out.println("ilosc kasy sprzedawcy: " + sprzedajacy.cash);
//        System.out.println("ilosc kasy kupujacego: " + kupujacy.cash);
//
//        System.out.println("Zwierzak sprzedawcy: " + sprzedajacy.pet.toString());
////        System.out.println("Zwierzak kupujacego: " + kupujacy.pet.toString());
//
//        System.out.println("SPRZEDAZ:");
//        petsprzedawcy.sell(kupujacy, sprzedajacy, 100.5);
//
//        System.out.println("PO SPRZEDAZY:");
//        System.out.println("ilosc kasy sprzedawcy: " + sprzedajacy.cash);
//        System.out.println("ilosc kasy kupujacego: " + kupujacy.cash);
//
////        System.out.println("Zwierzak sprzedawcy: " + sprzedajacy.pet.toString());
//        System.out.println("Zwierzak kupujacego: " + kupujacy.pet.toString());
//

//        BRAK KASY do przedniego zadania
//        System.out.println("SPRZEDAZ TELEFONU OD KUPUJACEGO DO SPRZEDAWCY:");
//        telefonkkupujacy.sell(sprzedajacy, kupujacy, 255.5);
//        System.out.println("Telefon sprzedajacego (aktualny wlasciciel po kupnie): " + sprzedajacy.phone.toString());
//        System.out.println("ilosc kasy sprzedawcy: " + sprzedajacy.cash);
//        System.out.println("ilosc kasy kupujacego: " + kupujacy.cash);


        System.out.println("---------------ZADANIE 9-------------------");

        Animal snake = new Animal("snake") {

            @Override
            public void feed(Double foodWeight) {
            }

        };
        snake.feed(1.5);


        FarmAnimal pig = new FarmAnimal("pig");
        pig.feed(200.5);

        pig.beEaten();


        System.out.println("---------------ZADANIE 10-------------------");


        LPG Golf = new LPG("Golf", "IV", 1998, 1000000);
        Golf.getFuel();
        Golf.refuel();
        Golf.getFuel();


        System.out.println("---------------ZADANIE 11-------------------");

        Human Tomek = new Human("Tom", "Duda", 4);

        Tomek.setCar(new LPG("test1", "test1", 2010, 111111.11), 0);
        Tomek.getCar(0);
        Tomek.setCar(new LPG("test2", "test2", 2015, 11.0), 1);
        Tomek.getCar(1);
        Tomek.setCar(new Electric("test2", "test2", 2020, 11.0), 2);
        Tomek.getCar(2);
        Tomek.setCar(new Diesel("test2", "test2", 2013, 11.0), 3);
        Tomek.getCar(3);

        System.out.println("---TOTAL COST---");
        Tomek.getValueALLCars();
        System.out.println("---B4 SORT---");
        Tomek.getAllCars();

        System.out.println("---AFTER SORT---");
        Tomek.sortCars();
        Tomek.getAllCars();
    }
}
