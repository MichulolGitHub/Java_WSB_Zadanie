package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Marek";
        me.lastName = "Kowalski";
        me.pet = new Animal("cat");
        me.car = new Car("Audi", "A7");


        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        System.out.println(me.pet.species);
        System.out.println("Moje auto to: " + me.car.producent);
        System.out.println("Model auta to: " + me.car.model);
    }
}
