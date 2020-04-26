package com.company;

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


    }
}
