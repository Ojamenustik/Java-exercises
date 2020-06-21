package com.ania;

interface Tax {
    int calculate(int taxBase, int taxRate);
}

public class TaxCount implements Tax {

    public static void run(){
        TaxCount a = new TaxCount();
        System.out.println(a.calculate(10, 20));
    }

    private Tax c = (p1, p2) -> {return p1*p2;};

    public int calculate(int taxBase, int taxRate) {
        return c.calculate(taxBase, taxRate);
    }
}
