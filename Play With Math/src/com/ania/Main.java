package com.ania;
import java.util.ArrayList;
import java.util.Scanner;

class GfG{

    static  long findGCD(long a, long b) {

        return b == 0?a:findGCD(b, a%b);
    }

    static long  lcm(long a, long b){
        return ((a*b)/findGCD(a, b));
    }

}


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int testCases = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < testCases; ++i) {
            final long A = sc.nextInt();
            final long B = sc.nextInt();
            long lcms = GfG.lcm(A, B);
            res.add(lcms/A + " " + lcms/B);
        }

        for( String Res : res)
        {
            System.out.println(Res);
        }
    }
}
