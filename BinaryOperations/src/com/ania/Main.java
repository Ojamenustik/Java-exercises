package com.ania;



public class Main {

    public static long getNumberOfOperations(String binaryNumber){
        long res = 0;

        if(binaryNumber.indexOf("1") != -1) {
            char[] binaryNumbers = binaryNumber.toCharArray();
            for (int i = binaryNumber.length() - 1; i > binaryNumber.indexOf("1"); --i) {
                if (binaryNumbers[i] == '0') {
                    res += 1;
                } else {
                    res += 2;
                }
            }

            res+=1;
        }

        return res;
    }

    public static void main(String[] args) {


        System.out.println(getNumberOfOperations("00011100"));

    }
}
