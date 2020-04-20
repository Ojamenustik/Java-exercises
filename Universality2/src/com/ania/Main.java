package com.ania;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for(int pierwsza = a +1 ; pierwsza < b ; pierwsza++){
            System.out.println(pierwsza);
        }

        for(int pierwsza = a + 1 ; pierwsza < b ; pierwsza++){
            if(pierwsza%c == 0) {
                System.out.println(pierwsza);
            }
        }

        for(int liczba = 1; a + (liczba*c) < b; ++liczba){
            System.out.println(a + (liczba*c) );
        }



        scanner.close();
    }
}
