package com.ania;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; ++i) {

            BigInteger applesKlaudiaAndNatalia = sc.nextBigInteger();
            BigInteger applesKlaudiaHasMore = sc.nextBigInteger();

            BigInteger applesNatalia = (applesKlaudiaAndNatalia.subtract(applesKlaudiaHasMore)).divide(BigInteger.valueOf(2));
            BigInteger applesKlaudia = applesNatalia.add(applesKlaudiaHasMore);

            System.out.println(applesKlaudia);
            System.out.println(applesNatalia);
        }

    }
}


