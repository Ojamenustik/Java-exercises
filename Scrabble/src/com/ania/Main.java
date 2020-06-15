package com.ania;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int points = 0;
            String word = sc.next();
            word = word.toLowerCase();
            char[] arr = word.toCharArray();
            for(char c : arr){

                if(c == 'b' || c == 'c' || c == 'm' || c == 'p'){
                    points += 3;
                }
                else if(c == 'f' || c == 'h' || c == 'v' || c == 'w' || c == 'y'){
                    points += 4;
                }
                else if(c == 'd' || c == 'g'){
                    points += 2;
                }
                else if(c == 'j' || c == 'x'){
                    points += 8;
                }
                else if(c == 'q' || c == 'z'){
                    points += 10;
                }
                else if(c == 'k'){
                    points += 5;
                }
                else{
                    points += 1;
                }
            }
            System.out.println(points);
        }


    }
}
