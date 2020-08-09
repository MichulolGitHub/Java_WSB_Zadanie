package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;


public class Human extends Animal {
    public Animal pet;
    public String firstName;
    String lastName;
    public Phone phone;

    public Car[] garage;


    private Double salary;
    public Double cash = 300.0;


    public Human(String firstName, String lastName, int numberParking) {

        super("homo sapiens");
        this.weight = 80.0;

        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[numberParking];


    }

    public void getValueALLCars() {
        Double allCarsValue = 0.0;
        for (Car car : this.garage) {
            if (car != null)
                allCarsValue += car.value;

        }
        System.out.println("Total Value of all your cars:" + allCarsValue);
    }


    public void getSalary() {

        System.out.println("Twoja aktualna wyplata to: " + salary);

    }

    public void setSalary(double newSalary) {


        if (newSalary < 0) {
            System.out.println("Nie można przypisać ujemnej kwoty. Prosze przypisz nową wartość.");
        } else if (newSalary == 0) {
            System.out.println("Podano nowa wyplate ktora wynosi 0. Prosze sprawdzic czy nowa wypłata została poprawnie wpisana.");
            this.salary = newSalary;
        } else {

            System.out.println("Przypisano nowa wartosc");
            System.out.println("Proszę odebrać aneks od Pani Hanny z kadr.");
            System.out.println("Prosze pamiętać, że ZUS WIE WSZYSTKO!!");
            this.salary = newSalary;

        }

    }


    public void getCar(int numberParking) {
        System.out.println(this.garage[numberParking]);

    }

    public void getAllCars() {
        int tempGarageLenght = this.garage.length;
        for (int i = 0; i < tempGarageLenght; i++) {
            int tempnumber = i + 1;
            System.out.println(tempnumber + ". " + this.garage[i]);
        }
    }

    public void setCar(Car car, int numberParking) {
        this.garage[numberParking] = car;

//
//        if (car.value <= this.salary) {
//            System.out.println("Zakupiles auto za gotówkę.");
//            this.car = car;
//        } else if (car.value <= this.salary * 12) {
//            System.out.println("Auto zakupione za pomoca kredytu.");
//            this.car = car;
//        } else {
//            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
//
//        }


    }

    public void sell() throws Exception {
        throw new Exception("Nie mozliwa jest sprzedaz");
    }

    @Override
    public void feed(Double foodWeight) {

    }


    //
    public void sortCars() {
        Arrays.sort(this.garage, (a, b) -> {
            Integer aValue = Integer.MAX_VALUE;
            Integer bValue = Integer.MAX_VALUE;
            if (a != null)
                aValue = a.getYearOfProduction();
            if (b != null)
                bValue = b.getYearOfProduction();
            return aValue - bValue;
        });
    }

//

}





