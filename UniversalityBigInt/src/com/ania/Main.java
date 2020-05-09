package com.ania;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final BigInteger  a = sc.nextBigInteger();
        final BigInteger  b = sc.nextBigInteger();
        final BigInteger  c = sc.nextBigInteger();

        BigInteger wynik1 = a.add(b.multiply(c)).divide(a);
        BigInteger wynik2 = a.multiply(b.multiply(c.add((b.subtract(a)).mod(b))));

        System.out.println(wynik1);
        System.out.println(wynik2);
    }
}
