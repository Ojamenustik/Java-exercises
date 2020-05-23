package com.ania;

public class Main {

    public static void main(String[] args) {

        Airplane Awionetka = new Airplane();
        System.out.println(Awionetka.getRangeInKM());
        System.out.println(Awionetka.getAmountOfFuelInL());

        Awionetka.fill(1000);
        System.out.println(Awionetka.getAmountOfFuelInL());

        Awionetka.fly();
    }
}
