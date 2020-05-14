package com.ania;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger intPower(int x, int n)
    {
        if (n == 0) return BigInteger.valueOf(1);

        // find x to the n/2 recursively
        BigInteger t = intPower(x, n/2);

        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n%2 == 0)
        {
            return t.multiply(t);
        }
        else
        {
            return (t.multiply(t)).multiply(BigInteger.valueOf(x));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(intPower(x, n));
    }
}
