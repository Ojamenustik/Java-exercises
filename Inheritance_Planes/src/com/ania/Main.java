package com.ania;

public class Main {

    public static void main(String[] args) {

        Airplane Awionetka = new Airplane();
        System.out.println(Awionetka.rangeInKM);
        System.out.println(Awionetka.amountOfFuelInL);

        Awionetka.fill(1000);
        System.out.println(Awionetka.amountOfFuelInL);

        Awionetka.fly();
    }
}
