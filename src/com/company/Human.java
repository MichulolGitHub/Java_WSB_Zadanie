package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
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

}





