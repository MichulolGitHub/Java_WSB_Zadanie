package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Marek";
        me.lastName = "Kowalski";
        me.pet = new Animal("cat");


        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        System.out.println(me.pet.getWeight());


        System.out.println("---------------ZADANIE 3 i 4---------------");
        me.setSalary(10321); // Ustawianie nowej pensji
        me.getSalary();  // Wypisywanie aktualnej pensji

        System.out.println("---------------ZADANIE 5---------------");
        me.setCar(new Car("Audi", "A7", 100000));
        System.out.println(me.getCar().model + " " + me.getCar().producent);

//        System.out.println("---------------ZADANIE 6/do poprawy--------------");
//        Human myWife = new Human();
//        myWife.firstName = "Karolina";
//        myWife.lastName = "Kowalski";
//        myWife.setCar(new Car("Audi","A7",100000));

        System.out.println("---------------ZADANIE 7---------------");
        System.out.println(me.species);
        me.feed();
        me.takeForAWalk();
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Object);

        System.out.println("----------------------------------");
        Phone nokia = new Phone();
        nokia.setProducent("Nokia");
        nokia.setModel("3310");
        System.out.println(nokia.toString());


    }
}
