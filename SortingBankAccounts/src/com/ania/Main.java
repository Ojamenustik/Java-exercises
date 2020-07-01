package com.ania;

import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int numberOfTests =  sc.nextInt();

        for(int j = 0; j < numberOfTests; ++j) {
            int numberOfAccounts = sc.nextInt();
            ArrayList<String> accountNumbers = new ArrayList();
            sc.nextLine();
            for (int i = 0; i < numberOfAccounts; ++i) {
                if(sc.hasNextLine()) {
                    accountNumbers.add(sc.nextLine());
                }
            }

            TreeMap<String, Integer> deduped = new TreeMap<>();

            for(String number : accountNumbers){
                deduped.put(number,Collections.frequency(accountNumbers,number));
            }

            for(String i : deduped.keySet()){
                sb.append(i);
                sb.append(" ");
                sb.append(deduped.get(i));
                sb.append(System.getProperty("line.separator"));
            }

            sb.append(System.getProperty("line.separator"));
        }

        System.out.println(sb);

    }
}
