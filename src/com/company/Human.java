package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;


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


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {

        if (car.value <= this.salary) {
            System.out.println("Zakupiles auto za gotówkę.");
            this.car = car;
        } else if (car.value <= this.salary * 12) {
            System.out.println("Auto zakupione za pomoca kredytu.");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");

        }


    }

}





