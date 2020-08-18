package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.devices.*;

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


        System.out.println("---------------ZADANIE 13-------------------");

        Phone Iphone = new Phone("X", "Iphone", 7.0, 2019);
        Tomek.setPhone(Iphone);

        Application pubg = new Application("pubg", 2.5, 100.0);
        Application messanger = new Application("messanger", 61.0, 23.0);
        Application snapchat = new Application("snapchat", 31.1, 0.0);
        Application free = new Application("free", 31.1, 0.0);
        Application millioner = new Application("millioner", 31.1, 5516132.0);
        Application poormillioner = new Application("poormillioner", 31.1, 155.0);
        Application notinstalled = new Application("notinstalled", 2.5, 0.0);

        Iphone.installAnApp(pubg);
        Iphone.installAnApp(snapchat);
        Iphone.installAnApp(free);
        Iphone.installAnApp(millioner);
        Iphone.installAnApp(poormillioner);


        System.out.println(Iphone.alreadyInstalled(pubg));
        System.out.println(Iphone.alreadyInstalled("notinstalled"));

        Iphone.totalValueOfApps();
        Iphone.ALLfreeApps();


        System.out.println("---------------ZADANIE 12-------------------");


        Human buyer1 = new Human("buyer1", "buyer1", 2);
        Human seller1 = new Human("seller1", "seller1", 2);

        Car ELPEGIE = new LPG("test1", "test1", 2010, 1.11);
        seller1.setCar(ELPEGIE, 0);

        System.out.print("Last owner of car: " + ELPEGIE + " is: ");
        ELPEGIE.lastOwner();

        ELPEGIE.sell(seller1, buyer1, ELPEGIE.value, 1);

        System.out.print("Last owner of car: " + ELPEGIE + " is: ");
        ELPEGIE.lastOwner();


        ELPEGIE.anyOwner();

        Car ELPEGIE1 = new LPG("test1", "test1", 2010, 1.11);
        ELPEGIE1.anyOwner();

        ELPEGIE1.howManyTrans();
        ELPEGIE.howManyTrans();
    }
}
