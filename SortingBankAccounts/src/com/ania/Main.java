package com.ania;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

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

            Collections.sort(accountNumbers);

            for(String number : accountNumbers){
                sb.append(number);
                sb.append(System.getProperty("line.separator"));
            }
            sb.append(System.getProperty("line.separator"));
        }

        System.out.println(sb);

    }
}
