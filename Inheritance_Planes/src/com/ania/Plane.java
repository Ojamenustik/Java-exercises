package com.ania;

public class Plane {

    private int rangeInKM;
    private int amountOfFuelInL;
    
    public void setAmountOfFuelInL(int amountOfFuelInL) {
        this.amountOfFuelInL = amountOfFuelInL < 0 ? 0 : amountOfFuelInL;
    }

    public int getRangeInKM() {
        return rangeInKM;
    }

    public int getAmountOfFuelInL() {
        return amountOfFuelInL;
    }


    public void fill(int n){
        System.out.println("Filled with "+ n + "l of fuel.");
        setAmountOfFuelInL(n);
    }

    public void fly(){
        if(amountOfFuelInL < 1000){
            System.out.println("Not enough fuel!");
        }else{
            System.out.println("Let's fly!");
        }
    }
}
