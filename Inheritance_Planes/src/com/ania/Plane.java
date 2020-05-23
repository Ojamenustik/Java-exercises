package com.ania;

public class Plane {
    public int rangeInKM;
    public int amountOfFuelInL;

    public void fill(int n){
        System.out.println("Filled with "+ n + "l of fuel.");
        amountOfFuelInL += n;
    }

    public void fly(){
        if(amountOfFuelInL < 1000){
            System.out.println("Not enough fuel!");
        }else{
            System.out.println("Let's fly!");
        }
    }
}
